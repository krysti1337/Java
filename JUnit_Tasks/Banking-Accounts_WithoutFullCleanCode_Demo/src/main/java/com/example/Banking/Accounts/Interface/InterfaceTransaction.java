package com.example.Banking.Accounts.Interface;

import java.time.LocalDate;

public interface InterfaceTransaction {
    String getMessageNumber();
    String getAccountId();
    double getAmount();
    LocalDate getTransactionDate();

    boolean isValid();
}
