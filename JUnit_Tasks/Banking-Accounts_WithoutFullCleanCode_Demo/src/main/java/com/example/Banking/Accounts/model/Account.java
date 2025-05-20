package com.example.Banking.Accounts.model;

import com.example.Banking.Accounts.Interface.InterfaceAccount;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDate;

@Getter
@Setter

public class Account implements InterfaceAccount {

    private String accountId;
    private String accountTypeCode;
    private String customerId;
    private double balance;
    private LocalDate dateOpened;
    private LocalDate closingDate;  // added for isClosed method

    public Account() {
    }

    public Account(String accountId, String accountTypeCode, String customerId, double balance, LocalDate dateOpened) {
        this.accountId = accountId;
        this.accountTypeCode = accountTypeCode;
        this.customerId = customerId;
        this.balance = balance;
        this.dateOpened = dateOpened;
    }

    //Method for checking if can with draw
    public boolean canWithdraw(double amount) {
        if (amount <= 0) {
            return false;
        }
        double withdrawalFee = calculateWithdrawalFee(amount);
        double total = amount + withdrawalFee;
        return balance >= total;
    }

    //Metoda pentru calcularea comisionului
    private double calculateWithdrawalFee(double amount){
        return amount * 0.01;
    }

    //Metoda withdraw
    public void withdraw(double amount){
        if(!canWithdraw(amount)){
            throw new IllegalStateException("Insuficient found");
        }
        double total = amount + calculateWithdrawalFee(amount);
        balance -= total;
    }

    //Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    //Overdrawn method
    public boolean isOverdrawn(){
        return balance < 0;
    }

    //Closing methods
    public boolean isClosed() {
        return closingDate != null && !closingDate.isAfter(LocalDate.now());
    }

    public void closeAccount(LocalDate closingDate) {
        this.closingDate = closingDate;
    }



}




