package com.example.reports;

import static net.sf.dynamicreports.report.builder.DynamicReports.*;
import static net.sf.dynamicreports.report.constant.Calculation.SUM;

import net.sf.dynamicreports.jasper.builder.JasperReportBuilder;
import net.sf.dynamicreports.report.builder.crosstab.*;
import net.sf.dynamicreports.report.builder.chart.BarChartBuilder;
import net.sf.dynamicreports.report.builder.column.TextColumnBuilder;
import net.sf.dynamicreports.report.datasource.DRDataSource;
import net.sf.dynamicreports.report.constant.HorizontalAlignment;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.*;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.text.DateFormatSymbols;
import java.util.*;

class DynamicCrosstabChartFromXml {

    public static class HolidayCount {
        private final String  country;
        private final Integer month;
        private final Integer count;
        private final String  monthName;
        public HolidayCount(String country, Integer month, Integer count) {
            this.country   = country;
            this.month     = month;
            this.count     = count;
            this.monthName = new DateFormatSymbols(Locale.ENGLISH)
                    .getMonths()[month - 1]
                    .toUpperCase();
        }
        public String  getCountry()   { return country;   }
        public Integer getMonth()     { return month;     }
        public Integer getCount()     { return count;     }
        public String  getMonthName() { return monthName; }
    }

    public static void main(String[] args) {
        try {
            // 1. Parse XML din resources
            File xmlFile = new File("src/main/resources/MyDataBase.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder dbuilder    = dbf.newDocumentBuilder();
            Document doc                = dbuilder.parse(xmlFile);
            NodeList nodes              = doc.getElementsByTagName("holydays");

            // 2. Extragem datele in lista de HolidayCount
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            List<HolidayCount> items = new ArrayList<>();
            for (int i = 0; i < nodes.getLength(); i++) {
                Element e      = (Element) nodes.item(i);
                String country = e.getElementsByTagName("COUNTRY")
                        .item(0).getTextContent();
                String dateStr = e.getElementsByTagName("DATE")
                        .item(0).getTextContent();
                Date date      = sdf.parse(dateStr);
                Calendar cal   = Calendar.getInstance();
                cal.setTime(date);
                int month      = cal.get(Calendar.MONTH) + 1; // 1..12
                items.add(new HolidayCount(country, month, 1));
            }

            // 3. Populam DRDataSource (country, month, count, monthName)
            DRDataSource ds = new DRDataSource("country","month","count","monthName");
            items.forEach(hc ->
                    ds.add(hc.getCountry(), hc.getMonth(), hc.getCount(), hc.getMonthName())
            );

            // 4. Definim coloanele
            TextColumnBuilder<String>  countryCol   = col.column("Country",   "country",   type.stringType());
            TextColumnBuilder<Integer> monthColInt  = col.column("Month",     "month",     type.integerType());
            TextColumnBuilder<Integer> countCol     = col.column("Count",     "count",     type.integerType());
            TextColumnBuilder<String>  monthNameCol = col.column("MonthName", "monthName", type.stringType());

            // 5. Crosstab: rand = country, coloana = month (int), masura = SUM(count)
            CrosstabRowGroupBuilder<String>   rowGroup    =
                    ctab.rowGroup("country", String.class)
                            .setTotalHeader("Total");
            CrosstabColumnGroupBuilder<Integer> columnGroup =
                    ctab.columnGroup("month", Integer.class)
                            .setTotalHeader("Total");
            CrosstabMeasureBuilder<Integer>     measure     =
                    ctab.measure("Holidays", "count", Integer.class, SUM);

            CrosstabBuilder crosstab =
                    ctab.crosstab()
                            .headerCell(cmp.text("Country / Month")
                                    .setStyle(stl.style()
                                            .bold()
                                            .setHorizontalAlignment(HorizontalAlignment.CENTER)))
                            .rowGroups(rowGroup)
                            .columnGroups(columnGroup)
                            .measures(measure)
                            .setDataSource(ds);

            // 6. Bar Chart: lunile pe axa X, bare grupate pe tari
            BarChartBuilder barChart =
                    cht.barChart()
                            .setTitle("Holidays per Month")
                            .setCategory(monthNameCol)
                            .series(
                                    // inlocuim apelul la setSeriesExpression cu setGroup(...)
                                    cht.groupedSerie(countCol)
                                            .setGroup(countryCol)
                            );

            // 7. Construim si exportam raportul
            JasperReportBuilder report = report();
            report
                    .title(
                            cmp.text("Holiday Report – Crosstab + Bar Chart")
                                    .setStyle(stl.style().bold().setFontSize(16))
                    )
                    .summary(crosstab)
                    .summary(barChart)
                    .pageFooter(cmp.pageXofY())
                    .setDataSource(ds)
                    .toPdf(new FileOutputStream("HolidayReport.pdf"));

            System.out.println("✅ HolidayReport.pdf generat cu succes!");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}