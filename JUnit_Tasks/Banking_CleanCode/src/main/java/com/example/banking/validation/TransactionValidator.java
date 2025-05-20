package com.example.banking.validation;

public class TransactionValidator {
    public boolean isValidAmount(double amount) {
        return amount > 0;
    }
}
