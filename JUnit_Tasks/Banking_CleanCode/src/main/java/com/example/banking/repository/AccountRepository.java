package com.example.banking.repository;

import com.example.banking.Account;

public interface AccountRepository {
    Account findById(String id);
    void save(Account account);
}
