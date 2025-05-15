package com.myholidays;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.design.JRDesignChart;

import java.io.FileNotFoundException;
import java.util.List;

import javax.swing.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String basePath = "src/main/resources/";

        // ✅ Obține lista de sărbători din XML
        List<Holiday> holidays = JRBeanExport.parseXML(basePath + "MyDataBase.xml");

        // 1. JasperReports clasic (.jrxml)
        try {
            JRBeanExport.toPDF(basePath);
        } catch (FileNotFoundException | JRException e) {
            e.printStackTrace();
        }

        // 2. DynamicReports: Chart + Crosstab
        try {
            HolidayVisualReportGenerator generator = new HolidayVisualReportGenerator();
            JasperPrint jp = generator.buildChartAndCrosstabReport(holidays);

            JasperExportManager.exportReportToPdfFile(jp, basePath + "HolidayChartAndCrosstabReport.pdf");
            System.out.println("'HolidayChartAndCrosstabReport.pdf' was exported successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}