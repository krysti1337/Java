package com.myholidays;

import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class XmlHolidayParser {

    public static List<Holiday> parse(InputStream xmlStream) throws Exception {
        List<Holiday> holidays = new ArrayList<>();
        var doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(xmlStream);
        NodeList nodes = doc.getElementsByTagName("holiday");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for (int i = 0; i < nodes.getLength(); i++) {
            Element e = (Element) nodes.item(i);
            String country = e.getElementsByTagName("country").item(0).getTextContent();
            String name = e.getElementsByTagName("name").item(0).getTextContent();
            String dateStr = e.getElementsByTagName("date").item(0).getTextContent();
            LocalDate date = LocalDate.parse(dateStr, formatter);
            holidays.add(new Holiday(country, name, date));
        }
        return holidays;
    }
}
