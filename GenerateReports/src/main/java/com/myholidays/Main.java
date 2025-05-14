package com.myholidays;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.io.FileInputStream;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        List<Holiday> holidays = XmlHolidayParser.parse(new FileInputStream("src/main/resources/MyDataBase.xml"));
        new HolidayReportGenerator().generate(holidays, "HolidayReport.pdf");
        System.out.println("Report created: HolidayReport.pdf");
    }
}