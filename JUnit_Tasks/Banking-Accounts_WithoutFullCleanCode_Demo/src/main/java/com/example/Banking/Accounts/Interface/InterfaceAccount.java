package com.example.Banking.Accounts.Interface;

import java.time.LocalDate;

public interface InterfaceAccount {

    String getAccountId();
    String getAccountTypeCode();
    String getCustomerId();
    double getBalance();
    LocalDate getDateOpened();
    boolean canWithdraw(double amount);
    void deposit(double amount);
    boolean isOverdrawn();
}
