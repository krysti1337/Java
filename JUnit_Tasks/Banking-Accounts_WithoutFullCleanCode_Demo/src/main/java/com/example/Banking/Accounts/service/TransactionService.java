package com.example.Banking.Accounts.service;

import com.example.Banking.Accounts.model.Transaction;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TransactionService {

    List<Transaction> transactions = new ArrayList<>();

    public Transaction createTransaction(String messageNumber, String accountId, double amount, LocalDate transactionDate){
        Transaction transaction = new Transaction(messageNumber, accountId, amount, transactionDate);
        transactions.add(transaction);
        return transaction;
    }

    public void isValid(Transaction transaction){
        transaction.isValid();
    }
}
