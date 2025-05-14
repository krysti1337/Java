package com.myholidays;

import java.time.LocalDate;

public class Holiday {
    private String country;
    private String name;
    private LocalDate date;

    public Holiday(String country, String name, LocalDate date) {
        this.country = country;
        this.name = name;
        this.date = date;
    }

    public String getCountry() { return country; }
    public String getName() { return name; }
    public LocalDate getDate() { return date; }

    public int getMonth() { return date.getMonthValue(); }
}
