package com.example.banking.service;

import com.example.banking.Account;
import com.example.banking.validation.TransactionValidator;

public class TransactionServiceImpl implements TransactionService {

    private final NotificationService notificationService;
    private final TransactionValidator validator;

    public TransactionServiceImpl(NotificationService notificationService, TransactionValidator validator) {
        this.notificationService = notificationService;
        this.validator = validator;
    }

    @Override
    public void deposit(Account account, double amount){
        if(!validator.isValidAmount(amount)){
            throw new IllegalArgumentException("Invalid deposit amount");
        }
        account.setBalance(account.getBalance() + amount);
        notificationService.notify(account.getId(), "Deposit successful. Balance : " + account.getBalance());
    }

    @Override
    public void withdraw(Account account, double amount){
        if(!validator.isValidAmount(amount) || account.getBalance() < amount){
            throw  new IllegalArgumentException("Invalid withdrawal");
        }
        account.setBalance(account.getBalance() - amount);
        notificationService.notify(account.getId(), "Withdrawal successful. Balance: " + account.getBalance());
    }
}
