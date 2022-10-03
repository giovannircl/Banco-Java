package com.giovannicacioli.bank;

public class Account {
    private String agency;
    private int account;
    private double balance;
    private String user;
    private Log log;

    public Account(String agency, int account, String user) {
        this.agency = agency;
        this.account = account;
        this.user = user;
        log = new Log();
    }

    public double getBalance() {
        return balance;
    }
    public String getUser() {
        return user;
    }
    public String getAgency() {
        return agency;
    }
    public int getAccount() {
        return account;
    }

    public void withdraw(double a){
        if(a > balance){
            log.out("The amount that you're trying to withdraw is higher than your balance ($" + balance + ")\n");
        }else{
            balance -= a;
            log.out("Withdraw succeed | New balance: $" + balance + "\n");
        }
    }

    public void deposit(double a){
        balance += a;
        log.out("Deposit succeed | New balance: $" + balance + "\n");
    }
}
