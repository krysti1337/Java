package com.example.banking;

import java.time.LocalDate;
import java.time.Period;

public class Account {

    private final String id;
    private final String type;
    private double balance;

    public Account(String id, String type, double balance) {
        this.id = id;
        this.type = type;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
