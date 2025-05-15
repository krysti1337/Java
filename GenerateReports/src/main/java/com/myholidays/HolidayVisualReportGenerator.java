package com.myholidays;

import net.sf.dynamicreports.report.builder.column.TextColumnBuilder;
import net.sf.dynamicreports.report.builder.style.StyleBuilder;
import net.sf.dynamicreports.report.constant.Calculation;
import net.sf.dynamicreports.report.constant.HorizontalAlignment;
import net.sf.dynamicreports.report.constant.PageType;
import net.sf.dynamicreports.report.datasource.DRDataSource;
import net.sf.dynamicreports.report.exception.DRException;
import net.sf.jasperreports.engine.JasperPrint;

import static net.sf.dynamicreports.report.builder.DynamicReports.*;

import java.util.List;

public class HolidayVisualReportGenerator {

    public JasperPrint buildChartAndCrosstabReport(List<Holiday> holidays) throws DRException {
        // Stiluri
        StyleBuilder boldStyle = stl.style().bold();
        StyleBuilder titleStyle = stl.style(boldStyle)
                .setFontSize(16)
                .setHorizontalAlignment(HorizontalAlignment.CENTER);

        // Coloane
        TextColumnBuilder<String> countryColumn = col.column("Country", "country", type.stringType());
        TextColumnBuilder<String> nameColumn = col.column("Name", "name", type.stringType());
        TextColumnBuilder<String> dateColumn = col.column("Date", "date", type.stringType());
        TextColumnBuilder<Integer> monthColumn = col.column("Month", "month", type.integerType());

        // Sursa de date
        DRDataSource dataSource = new DRDataSource("country", "name", "date", "month");

        for (Holiday h : holidays) {
            try {
                int month = Integer.parseInt(h.getDATE().substring(3, 5)); // "dd/MM/yyyy"
                dataSource.add(h.getCOUNTRY(), h.getNAME(), h.getDATE(), month);
            } catch (Exception e) {
                System.err.println("Date parsing error: " + h.getDATE());
            }
        }

        // Generează raportul
        return report()
                .setPageFormat(PageType.A4)
                .columns(countryColumn, nameColumn, dateColumn)
                .title(cmp.text("Holiday Report with Chart & Crosstab").setStyle(titleStyle))
                .summary(
                        // Bar chart
                        cht.barChart()
                                .setTitle("Holidays per Country & Month")
                                .setCategory(countryColumn)
                                .series(cht.serie(monthColumn))
                                .setCategoryAxisFormat(cht.axisFormat().setLabel("Country"))
                                .setValueAxisFormat(cht.axisFormat().setLabel("Month"))
                                .setDataSource(dataSource),

                        // Crosstab
                        ctab.crosstab()
                                .headerCell(cmp.text("Holiday Crosstab"))
                                .rowGroups(ctab.rowGroup("country", String.class))
                                .columnGroups(ctab.columnGroup("month", Integer.class))
                                .measures(ctab.measure("name", String.class, Calculation.COUNT))
                )
                .toJasperPrint();
    }
}
