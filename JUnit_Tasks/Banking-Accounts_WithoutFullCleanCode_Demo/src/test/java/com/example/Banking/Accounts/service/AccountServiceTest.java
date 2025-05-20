package com.example.Banking.Accounts.service;

import com.example.Banking.Accounts.model.Account;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.time.LocalDate;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class AccountServiceTest {

    private AccountService accountService;

    @Before
    public void setup() {
        accountService = new AccountService();
    }

    @Test
    public void testCreateAccount() {
        Account expected = new Account("acc1", "SAV", "cust1", 100.0, LocalDate.now());
        Account actual = accountService.createAccount("acc1", "SAV", "cust1", 100.0, LocalDate.now());

        assertEquals(expected.getAccountId(), actual.getAccountId());
        assertEquals(expected.getAccountTypeCode(), actual.getAccountTypeCode());
        assertEquals(expected.getCustomerId(), actual.getCustomerId());
        assertEquals(expected.getBalance(), actual.getBalance(), 0.001);
        assertEquals(expected.getDateOpened(), actual.getDateOpened());
        assertEquals(expected.getClosingDate(), actual.getClosingDate());
    }

    @Test
    public void testDeposit() {
        Account acc = new Account("acc1", "SAV", "cust1", 100.0, LocalDate.now());
        boolean success = accountService.deposit(acc, 50.0);
        assertTrue(success);
        assertEquals(150.0, acc.getBalance(), 0.01);
    }

    @Test
    public void testWithdrawSuccess() {
        Account acc = new Account("acc1", "SAV", "cust1", 200.0, LocalDate.now());
        boolean success = accountService.withdraw(acc, 150.0);
        Assert.assertTrue(success);
        assertEquals(48.5, acc.getBalance(), 0.01);
    }

    @Test
    public void testWithdrawFail() {
        Account acc = new Account("acc1", "SAV", "cust1", 100.0, LocalDate.now());
        boolean success = accountService.withdraw(acc, 150.0);
        Assert.assertFalse(success);
        assertEquals(100.0, acc.getBalance(), 0.01);
    }

    @Test
    public void testCloseAccount() {
        Account acc = new Account("acc1", "SAV", "cust1", 100.0, LocalDate.now());
        accountService.closeAccount(acc);
        assertTrue(acc.isClosed());
    }
}
