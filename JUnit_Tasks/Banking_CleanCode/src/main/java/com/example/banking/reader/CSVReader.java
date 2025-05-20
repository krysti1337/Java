package com.example.banking.reader;

import com.example.banking.Account;

import java.util.List;

public class CSVReader implements DataReader{
    @Override
    public List<Account> readAccounts(){
        //Read from CSV file
        return List.of(new Account("1", "CURRENT", 1000));
    }
}
