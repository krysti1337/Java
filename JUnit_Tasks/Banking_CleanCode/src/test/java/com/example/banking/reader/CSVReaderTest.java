package com.example.banking.reader;

import static org.junit.jupiter.api.Assertions.*;
import com.example.banking.Account;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CSVReaderTest {

    @Test
    void shouldReadAccountsFromCsv(){
        CSVReader reader = new CSVReader();
        List<Account> accounts = reader.readAccounts();

        assertFalse(accounts.isEmpty());
        assertEquals("1", accounts.get(0).getId());
    }
}
