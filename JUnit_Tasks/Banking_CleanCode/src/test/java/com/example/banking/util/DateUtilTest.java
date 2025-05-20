package com.example.banking.util;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateUtilTest {

    @Test
    void shouldCalculateYearsBetweenDates(){
        LocalDate from = LocalDate.of(2020, 1, 1);
        LocalDate to = LocalDate.of(2023, 1, 1);

        assertEquals(3, DateUtil.yearsBetween(from, to));
    }

    @Test
    void zeroYearsBetweenSameDates(){
        LocalDate today = LocalDate.now();

        assertEquals(0, DateUtil.yearsBetween(today, today));
    }
}
