package com.example.banking.service;
import com.example.banking.Account;

public interface TransactionService {
    void deposit(Account account, double amount);
    void withdraw(Account account, double amount);
}
