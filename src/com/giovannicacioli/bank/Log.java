package com.giovannicacioli.bank;

public class Log {
    public void out(String msg){
        System.out.println("Log: " + msg);
    }
    public void info(Account account){
        System.out.println("Account: " + account.getAccount() + " | Agency: " + account.getAgency() + " | Username: " + account.getUser() + " | Balance: $" + account.getBalance());
    }
}
