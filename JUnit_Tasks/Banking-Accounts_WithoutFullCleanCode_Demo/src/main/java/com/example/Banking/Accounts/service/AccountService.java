package com.example.Banking.Accounts.service;


import com.example.Banking.Accounts.model.Account;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AccountService {

    private List<Account> accounts = new ArrayList<>();

    public Account createAccount(String accountId, String accountTypeCode, String costumerId, double balance, LocalDate dateOpened){

        Account account = new Account(accountId, accountTypeCode, costumerId, balance, dateOpened);
        accounts.add(account);
        return account;
    }

    //Service method withdraw
    public boolean withdraw(Account account, double amount){
        if(account.canWithdraw(amount)){
            // Apelăm efectiv retragerea
            account.withdraw(amount);
            return true;
        }
        return false;
    }

    //Service method deposit
    public boolean deposit(Account account, double amount){
        if(amount > 0){
            account.deposit(amount);
            return true;
        }
        return false;
    }

    //Service method closeAccount
    public void closeAccount(Account account){
        account.closeAccount(LocalDate.now());
    }

    public List<Account> getAllAccounts(){
        return accounts;
    }
}
