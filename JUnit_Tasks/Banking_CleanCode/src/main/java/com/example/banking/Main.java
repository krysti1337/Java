package com.example.banking;

import com.example.banking.service.NotificationService;
import com.example.banking.service.NotificationServiceImpl;
import com.example.banking.service.TransactionService;
import com.example.banking.service.TransactionServiceImpl;
import com.example.banking.validation.TransactionValidator;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationServiceImpl();
        TransactionValidator validator = new TransactionValidator();
        TransactionService service = new TransactionServiceImpl(notificationService, validator);

        Account account = new Account("1", "CURRENT", 1000.0);
        service.deposit(account, 200.0);
        service.withdraw(account, 50.0);
    }
}