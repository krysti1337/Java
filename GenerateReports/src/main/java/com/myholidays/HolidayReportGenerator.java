package com.myholidays;

import net.sf.dynamicreports.report.builder.column.TextColumnBuilder;
import net.sf.dynamicreports.report.builder.component.ComponentBuilder;
import net.sf.dynamicreports.report.builder.style.StyleBuilder;
import net.sf.dynamicreports.report.constant.HorizontalAlignment;
import net.sf.dynamicreports.report.constant.PageType;
import net.sf.dynamicreports.report.datasource.DRDataSource;
import net.sf.dynamicreports.report.exception.DRException;
import net.sf.dynamicreports.report.builder.DynamicReports;

import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static net.sf.dynamicreports.report.builder.DynamicReports.*;

public class HolidayReportGenerator {
    public void generate(List<Holiday> holidays, String outputPath) throws DRException, FileNotFoundException {
        StyleBuilder boldStyle = stl.style().bold();
        StyleBuilder titleStyle = stl.style(boldStyle)
                .setFontSize(16)
                .setHorizontalAlignment(HorizontalAlignment.CENTER);

        TextColumnBuilder<String> countryCol = col.column("Country", "country", type.stringType());
        TextColumnBuilder<String> nameCol = col.column("Name", "name", type.stringType());
        TextColumnBuilder<String> dateCol = col.column("Date", "date", type.stringType());

        DRDataSource dataSource = new DRDataSource("country", "name", "date");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for (Holiday h : holidays) {
            dataSource.add(h.getCountry(), h.getName(), h.getDate().format(formatter));
        }
        try (OutputStream outputStream = new FileOutputStream("HolidayReport.pdf")) {
            report()
                    .setPageFormat(PageType.A4)
                    .columns(countryCol, nameCol, dateCol)
                    .title(cmp.text("Holiday Report 2021").setStyle(titleStyle))
                    .pageFooter(cmp.pageXofY())
                    .setDataSource(dataSource)
                    .toPdf(outputStream);
        } catch (Exception e) {
            throw new DRException("Failed to export PDF", e);
        }
        }
    }
