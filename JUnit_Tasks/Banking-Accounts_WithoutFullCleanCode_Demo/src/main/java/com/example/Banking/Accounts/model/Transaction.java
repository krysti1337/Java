package com.example.Banking.Accounts.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Transaction {

    private String messageNumber;
    private String accountId;
    private double amount;
    private LocalDate transactionDate;

    public Transaction() {
    }

    public Transaction(String messageNumber, String accountId, double amount, LocalDate transactionDate) {
        this.messageNumber = messageNumber;
        this.accountId = accountId;
        this.amount = amount;
        this.transactionDate = transactionDate;
    }

    //valid transaction
    public boolean isValid() {
        return amount > 0 && !transactionDate.isAfter(LocalDate.now());
    }
}
