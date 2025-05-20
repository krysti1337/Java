package com.example.banking.reader;
import com.example.banking.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
public class ConsoleReaderTest {

    @Test
    void shouldReadAccountsFromConsole() {
        ConsoleReader reader = new ConsoleReader();
        List<Account> accounts = reader.readAccounts();

        assertFalse(accounts.isEmpty());
        assertEquals("2", accounts.get(0).getId());
    }
}
