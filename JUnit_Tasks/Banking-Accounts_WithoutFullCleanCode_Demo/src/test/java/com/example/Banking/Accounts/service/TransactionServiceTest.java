package com.example.Banking.Accounts.service;

import com.example.Banking.Accounts.model.Transaction;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class TransactionServiceTest {
    @Mock
    List<Transaction> transactions;
    @InjectMocks
    TransactionService transactionService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCreateTransaction(){
        when(transactions.add(any(Transaction.class))).thenReturn(true);
        Transaction expected = new Transaction("messageNumber", "accountId", 100.0, LocalDate.of(2025, Month.MAY, 6));
        Transaction result = transactionService.createTransaction("messageNumber", "accountId", 100.0, LocalDate.of(2025, Month.MAY, 6));
        assertEquals(expected.getMessageNumber(), result.getMessageNumber());
        assertEquals(expected.getAccountId(), result.getAccountId());
        assertEquals(expected.getAmount(), result.getAmount(), 0.001);
        assertEquals(expected.getTransactionDate(), result.getTransactionDate());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsValidShouldThrowForNegativeAmount() {
        Transaction transaction = new Transaction("msg", "acc", -50.0, LocalDate.now());
        transactionService.isValid(transaction);
    }
}
