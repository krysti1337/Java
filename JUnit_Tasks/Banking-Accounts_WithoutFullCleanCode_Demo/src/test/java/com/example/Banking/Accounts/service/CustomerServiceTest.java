package com.example.Banking.Accounts.service;

import com.example.Banking.Accounts.model.Customer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.time.LocalDate;
import java.time.Month;
import static org.junit.Assert.assertEquals;

public class CustomerServiceTest {
    private CustomerService customerService;

    @Before
    public void setup() {
        customerService = new CustomerService();
    }

    @Test
    public void testRegisterCustomer(){
        Customer result = customerService.registerCustomer("customerId", "customerTypeCode", "name", "email", LocalDate.of(2025, Month.MAY, 6));
        Customer expected = new Customer("customerId", "customerTypeCode", "name", "email", LocalDate.of(2025, Month.MAY, 6));
        assertEquals(expected.getCustomerId(), result.getCustomerId());
        assertEquals(expected.getCustomerTypeCode(), result.getCustomerTypeCode());
        assertEquals(expected.getName(), result.getName());
        assertEquals(expected.getEmail(), result.getEmail());
        assertEquals(expected.getDateBecameCustomer(), result.getDateBecameCustomer());
    }

    @Test
    public void testIsActive() {
        boolean result = customerService.isActive(new Customer("customerId", "customerTypeCode", "name", "email", LocalDate.of(2025, Month.MAY, 5)));
        Assert.assertEquals(true, result);


        result = customerService.isActive(new Customer("customerId", "customerTypeCode", "name", "email", LocalDate.of(2020, Month.MAY, 5)));
        Assert.assertEquals(true, result);
    }

}
