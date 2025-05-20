package com.example.Banking.Accounts.model;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class CustomerTestMeTest {

    Customer customer = new Customer("CUST1", "INDIVIDUAL", "John Doe", "john@test.com", LocalDate.of(2020, 1, 1));

    @Test
    public void testIsActive(){
        boolean result = customer.isActive();
        Assert.assertEquals(true, result);
    }
}
