package com.example.banking;

import com.example.banking.reader.CSVReader;
import com.example.banking.repository.AccountRepositoryOracle;
import com.example.banking.repository.CustomerRepositoryOracle;

import java.util.List;

public class DataImporter {

    public static void main(String [] args){
        String customerCsvPath = "customers.csv";
        String accountCsvPath = "accounts.csv";

        CSVReader reader = new CSVReader();
        List<Customer> customers = reader.readCustomers(customerCsvPath);
        List<Account> accounts = reader.readAccounts(accountCsvPath);

        CustomerRepositoryOracle customerRepo = new CustomerRepositoryOracle();
        AccountRepositoryOracle accountRepo = new AccountRepositoryOracle();

        for (Customer customer : customers){
            customerRepo.save(customer);
        }

        for (Account account : accounts){
            accountRepo.save(account);
        }

        System.out.println("Data import completed.");
    }
}
