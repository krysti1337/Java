package com.example.banking.reader;

import com.example.banking.Account;

import java.util.List;

public class ConsoleReader implements DataReader{

    @Override
    public List<Account> readAccounts(){
        //Read manually from console input
        return List.of(new Account("2", "Savings", 500));
    }
}
