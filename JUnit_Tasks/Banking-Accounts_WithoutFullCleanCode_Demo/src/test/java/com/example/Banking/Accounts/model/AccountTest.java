package com.example.Banking.Accounts.model;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AccountTest {
    @Test
    public void canWithdraw_returnsTrueIfBalanceIsSufficient(){
        Account account = new Account("ACC1", "SAVINGS", "CUST1", 1000.0, LocalDate.now());
        assertTrue(account.canWithdraw(500));
        assertFalse(account.canWithdraw(1500));
    }

    @Test
    public void isOverdrawn_shouldReturnTrueWhenBalanceIsNegative(){
        // Cream un cont cu sold negativ
        Account account = new Account("ACC123", "CHECKING", "CUST1", -50.0, LocalDate.now());

        // Verificam daca e "overdrawn"
        assertTrue(account.isOverdrawn());
    }

    @Test
    public void isOverdrawn_shouldReturnFalseWhenBalanceIsPositive(){
        // Cont cu sold pozitiv
        Account account = new Account("ACC456", "SAVINGS", "CUST1", 100.0, LocalDate.now());

        // Act & Assert
        assertFalse(account.isOverdrawn());
    }

    @Test(expected = IllegalStateException.class)
    public void withdraw_shouldThrowExceptionIfNotEnoughBalance() {
        Account account = new Account("ACC1", "SAVINGS", "CUST1", 1000.0, LocalDate.now());
        account.withdraw(1500);
    }

    @Test
    public void canWithdraw_returnsFalseIfAmountIsZeroOrNegative() {
        Account account = new Account("ACC1", "SAVINGS", "CUST1", 1000.0, LocalDate.now());
        assertFalse(account.canWithdraw(0));
        assertFalse(account.canWithdraw(-500));
    }

    @Test
    public void isClosed_shouldReturnTrueIfClosingDateIsPast() {
        Account account = new Account("ACC1", "SAVINGS", "CUST1", 1000.0, LocalDate.now());
        account.closeAccount(LocalDate.now().minusDays(1));
        assertTrue(account.isClosed());
    }

    @Test
    public void isClosed_shouldReturnFalseIfClosingDateIsNull() {
        Account account = new Account("ACC1", "SAVINGS", "CUST1", 1000.0, LocalDate.now());
        assertFalse(account.isClosed());
    }

}
