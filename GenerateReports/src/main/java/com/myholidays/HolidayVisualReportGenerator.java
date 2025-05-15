package com.myholidays;

import net.sf.dynamicreports.report.builder.chart.BarChartBuilder;
import net.sf.dynamicreports.report.builder.column.TextColumnBuilder;
import net.sf.dynamicreports.report.builder.style.StyleBuilder;
import net.sf.dynamicreports.report.constant.Calculation;
import net.sf.dynamicreports.report.constant.HorizontalAlignment;
import net.sf.dynamicreports.report.constant.PageType;
import net.sf.dynamicreports.report.datasource.DRDataSource;
import net.sf.dynamicreports.report.exception.DRException;
import net.sf.jasperreports.engine.JasperPrint;

import static net.sf.dynamicreports.report.builder.DynamicReports.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HolidayVisualReportGenerator {

    public JasperPrint buildChartAndCrosstabReport(List<Holiday> holidays) throws DRException {
        // Stiluri
        StyleBuilder titleStyle = stl.style().bold().setFontSize(16).setHorizontalAlignment(HorizontalAlignment.CENTER);

        // Coloane pentru tabel & crosstab
        TextColumnBuilder<String> countryCol = col.column("Country", "country", type.stringType());
        TextColumnBuilder<String> nameCol = col.column("Name", "name", type.stringType());
        TextColumnBuilder<String> dateCol = col.column("Date", "date", type.stringType());

        // DataSource general
        DRDataSource tableSource = new DRDataSource("country", "name", "date", "month");

        // Agregare pentru bar chart
        Map<String, Integer> countryCount = new HashMap<>();

        for (Holiday h : holidays) {
            try {
                int month = Integer.parseInt(h.getDATE().substring(3, 5));
                tableSource.add(h.getCOUNTRY(), h.getNAME(), h.getDATE(), month);

                // Agregare
                countryCount.merge(h.getCOUNTRY(), 1, Integer::sum);
            } catch (Exception e) {
                System.err.println("Date parsing error: " + h.getDATE());
            }
        }

        // DataSource pentru bar chart
        DRDataSource chartSource = new DRDataSource("country", "count");
        for (Map.Entry<String, Integer> entry : countryCount.entrySet()) {
            chartSource.add(entry.getKey(), entry.getValue());
        }

        // Bar chart
        BarChartBuilder barChart = cht.barChart()
                .setTitle("Number of Holidays per Country")
                .setCategory(col.column("Country", "country", type.stringType()))
                .series(cht.serie(col.column("Holidays", "count", type.integerType())))
                .setDataSource(chartSource);

        // Crosstab
        var crosstab = ctab.crosstab()
                .headerCell(cmp.text("Holiday Crosstab"))
                .rowGroups(ctab.rowGroup("country", String.class))
                .columnGroups(ctab.columnGroup("month", Integer.class))
                .measures(ctab.measure("name", String.class, Calculation.COUNT))
                .setDataSource(tableSource);

        return report()
                .setPageFormat(PageType.A4)
                .columns(countryCol, nameCol, dateCol)
                .title(cmp.text("Holiday Report with Chart & Crosstab").setStyle(titleStyle))
                .summary(barChart, crosstab)
                .toJasperPrint();
    }
}
