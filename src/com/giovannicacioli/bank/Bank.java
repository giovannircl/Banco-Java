package com.giovannicacioli.bank;

import java.util.List;
import java.util.ArrayList;

public class Bank {
    private String name;
    private String agency;
    private int firstAccount = 1;
    private List<Account> accounts;

    public Bank(String name, String agency) {
        this.name = name;
        this.agency = agency;
        this.accounts = new ArrayList<>();
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public String getName() {
        return name;
    }

    public String getAgency() {
        return agency;
    }

    public Account generateAccount(String name){
        Account account = new Account(agency, firstAccount, name);
        firstAccount++;
        return account;
    }

    public void insertAccount(Account account){
        accounts.add(account);
    }

    public void removeAccount(Account account){
        accounts.remove(account);
    }
}
