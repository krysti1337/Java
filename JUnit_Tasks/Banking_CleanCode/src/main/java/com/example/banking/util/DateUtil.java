package com.example.banking.util;

import java.time.LocalDate;
import java.time.Period;

public class DateUtil {
    public static int yearsBetween(LocalDate from, LocalDate to) {
        return Period.between(from, to).getYears();
    }
}
