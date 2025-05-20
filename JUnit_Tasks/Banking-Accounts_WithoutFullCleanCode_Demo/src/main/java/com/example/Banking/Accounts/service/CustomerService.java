package com.example.Banking.Accounts.service;

import com.example.Banking.Accounts.model.Customer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CustomerService {

    List<Customer> customers = new ArrayList<>();

    public Customer registerCustomer(String customerId, String customerTypeCode, String name, String email, LocalDate dateBecameCustomer){
        Customer customer = new Customer(customerId, customerTypeCode, name, email, dateBecameCustomer);
        customers.add(customer);
        return customer;
    }

    public boolean isActive(Customer customer) {
        return !customer.getDateBecameCustomer().isAfter(LocalDate.now());
    }
}
