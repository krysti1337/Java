package com.myholidays;

import java.time.LocalDate;

public class Holiday {
    private String country;
    private String date;
    private String name;


    public Holiday(String country, String date, String name) {
        this.country = country;
        this.date = date;
        this.name = name;
    }

    public String getCOUNTRY() { return country; }

    public String getDATE() { return date; }

    public String getNAME() { return name; }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return Integer.parseInt(date.substring(3, 5)); // Extract MM din dd/MM/yyyy
    }
}
