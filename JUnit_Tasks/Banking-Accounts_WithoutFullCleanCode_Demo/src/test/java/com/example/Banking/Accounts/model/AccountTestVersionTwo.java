package com.example.Banking.Accounts.model;


import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class AccountTestVersionTwo {

    @Test
    public void testCanWithdraw(){
        Account account = new Account("ACC1", "SAVINGS", "CUST1", 1000.0, LocalDate.now());

        boolean result = account.canWithdraw(500);
        assertEquals(true, result);
    }

    @Test
    public void testDepositWithZeroAmount_ShouldNotChangeBalance() {
        Account account = new Account("ACC1", "SAVINGS", "CUST1", 1000.0, LocalDate.now());

        account.deposit(0.00);

        assertEquals(1000.0, account.getBalance(), 0.001);  // verificam daca soldul a ramas acelasi
    }

    @Test
    public void testIsOverdrawn(){
        Account account = new Account("ACC1", "SAVINGS", "CUST1", -200, LocalDate.now());

        boolean result = account.isOverdrawn();
        assertEquals(true, result);
    }
}
