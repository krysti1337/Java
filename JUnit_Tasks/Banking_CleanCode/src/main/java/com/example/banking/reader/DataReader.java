package com.example.banking.reader;

import com.example.banking.Account;

import java.util.List;

public interface DataReader {
    List<Account> readAccounts();
}
