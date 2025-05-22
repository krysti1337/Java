package com.example.banking.repository;

import com.example.banking.Account;

import java.util.HashMap;
import java.util.Map;

public class AccountRepositoryInMemory implements AccountRepository{
    private final Map<String, Account> store = new HashMap<>();

    @Override
    public Account findById(String id) {
        return store.get(id);
    }

    @Override
    public void save(Account account) {
        store.put(String.valueOf(account.getId()), account);
    }
}
