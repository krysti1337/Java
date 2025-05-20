package com.example.Banking.Accounts.model;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class CustomerTest {

    @Test
    public void isActive_returnsTrueIfCustomerHasValidDate(){
        //Verificare de valid date
        Customer customer = new Customer("CUST1", "INDIVIDUAL", "John Doe", "john@test.com", LocalDate.of(2020, 1, 1));
        assertTrue(customer.isActive());
    }

    @Test
    public void isActive_returnsTrueIfCustomerHasFutureDate() {
        Customer customer = new Customer("CUST2", "INDIVIDUAL", "Jane Doe", "jane@test.com", LocalDate.of(2025, 1, 1));
        assertTrue(customer.isActive());
    }


    @Test
    public void isActive_returnsFalseIfCustomerHasNullDate() {
        Customer customer = new Customer("CUST3", "INDIVIDUAL", "Sam Smith", "sam@test.com", null);
        assertFalse(customer.isActive());
    }


}
