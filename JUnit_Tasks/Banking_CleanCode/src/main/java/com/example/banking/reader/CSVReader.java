package com.example.banking.reader;

import com.example.banking.Account;
import com.example.banking.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVReader implements DataReader {

    @Override
    public List<Account> readAccounts(String fileName) {
        List<Account> accounts = new ArrayList<>();
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("accounts.csv")) {
            if (input == null) {
                throw new IOException("accounts.csv" + " not found in classpath");
            }
            BufferedReader br = new BufferedReader(new InputStreamReader(input));
            String line = br.readLine(); // skip header
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                Account account = new Account(values[0], values[1], Double.parseDouble(values[2]));
                if (account.isValid()) {
                    accounts.add(account);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return accounts;
    }

    @Override
    public List<Customer> readCustomers(String filePath) {
        List<Customer> customers = new ArrayList<>();
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("customers.csv")) {
            if (input == null) {
                throw new IOException("customers.csv" + " not found in classpath");
            }
            BufferedReader br = new BufferedReader(new InputStreamReader(input));
            String line = br.readLine(); // skip header
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                Customer customer = new Customer(values[0], values[1], values[2]);
                if (customer.isValid()) {
                    customers.add(customer);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return customers;
    }
}
