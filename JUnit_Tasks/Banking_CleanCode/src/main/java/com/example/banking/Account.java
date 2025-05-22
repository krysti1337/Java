package com.example.banking;

public class Account {
    private String id;
    private String customerId;
    private double balance;

    public Account(String id, String customerId, double balance) {
        this.id = id;
        this.customerId = customerId;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public double getBalance() {
        return balance;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isValid() {
        return id != null && !id.isEmpty() && customerId != null && !customerId.isEmpty() && balance >= 0;
    }
}

