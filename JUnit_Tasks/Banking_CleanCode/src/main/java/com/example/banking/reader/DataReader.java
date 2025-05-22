package com.example.banking.reader;

import com.example.banking.Account;
import com.example.banking.Customer;

import java.util.List;

public interface DataReader {
    List<Account> readAccounts(String filePath);
    List<Customer> readCustomers(String filePath);
}
