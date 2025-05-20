package com.example.banking.repository;

import com.example.banking.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
Fara Mockito -> testam repo dummy
 */
public class AccountRepositoryInMemoryTest {

    private  AccountRepositoryInMemory repository;

    @BeforeEach
    void setUp(){
        repository = new AccountRepositoryInMemory();
    }

    @Test
    void shouldSaveAndFindAccount(){
        Account account = new Account("1", "CURRENT", 500.0);
        repository.save(account);

        Account retrieved = repository.findById("1");
        assertNotNull(retrieved);
        assertEquals(500.0, retrieved.getBalance());
    }

    @Test
    void shouldReturnNullForNonExistingAccount(){
        Account result = repository.findById("nonExistingAccount");
        assertNull(result);
    }
}
