package com.example.Banking.Accounts.model;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TransactionTests {

    @Test
    public void isValid_shouldReturnTrueForValidTransaction(){
        // Daca e negativ
        Transaction transaction = new Transaction("TXN", "ACC1", 100.0, LocalDate.now().minusDays(1));
        assertTrue(transaction.isValid());
    }

    @Test
    public void isValid_shouldReturnFalseForFutureDate(){
        // Data in viitor
        Transaction transaction = new Transaction("TXN3", "ACC1", 200.0, LocalDate.now().plusDays(1));
        assertFalse(transaction.isValid());
    }
}
