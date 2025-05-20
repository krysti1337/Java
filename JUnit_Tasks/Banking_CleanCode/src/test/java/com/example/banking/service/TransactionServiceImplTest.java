package com.example.banking.service;

import com.example.banking.Account;
import com.example.banking.validation.TransactionValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

/*
Mockito for NotificationService
 */
public class TransactionServiceImplTest {

    private NotificationService notificationServiceMock;
    private TransactionValidator validator;
    private TransactionServiceImpl transactionService;
    private Account account;

    @BeforeEach
    void setUp(){
        notificationServiceMock = mock(NotificationService.class);
        validator = new TransactionValidator();
        transactionService = new TransactionServiceImpl(notificationServiceMock, validator);
        account = new Account("1", "CURRENT", 1000.0);
    }

    @Test
    void depositShouldIncreaseBalanceAndNotify(){
        transactionService.deposit(account, 200.0);

        assertEquals(1200.0, account.getBalance());
        verify(notificationServiceMock).notify(eq("1"), contains("Deposit successful"));
    }

    @Test
    void depositWithInvalidAmountShouldThrowException(){
        assertThrows(IllegalArgumentException.class, () -> transactionService.deposit(account, -100.0));
        verifyNoInteractions(notificationServiceMock);
    }

    @Test
    void withdrawShouldDecreaseBalanceAndNotify(){
        transactionService.withdraw(account, 300.0);

        assertEquals(700.0, account.getBalance());
        verify(notificationServiceMock).notify(eq("1"), contains("Withdrawal successful"));
    }

    @Test
    void withdrawWithInvalidAmountShouldThrowException(){
        assertThrows(IllegalArgumentException.class, () -> transactionService.withdraw(account, -100.0));
        verifyNoInteractions(notificationServiceMock);
    }

    @Test
    void withdrawWithInsufficientFundsShouldThrowException(){
        assertThrows(IllegalArgumentException.class, () -> transactionService.withdraw(account, 2000.0));
        verifyNoInteractions(notificationServiceMock);
    }
}
