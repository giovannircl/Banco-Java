package com.giovannicacioli.bank;

import java.util.Scanner;
import java.util.List;

public class App {
    public static void main(String[] args){
        Bank nubank = new Bank("Nubank", "0001");
        operateBank(nubank);
    }

    static void operateBank(Bank bank){
        Log log = new Log();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the " + bank.getName() + " system!");
        while(true) {
            System.out.println("Choose an option -> C-Create account | R-Remove account | E-Exit");
            String op = scanner.nextLine();

            if (op.equals("C")) {
                System.out.println("Type your account name:");
                String name = scanner.nextLine();
                Account account = bank.generateAccount(name);
                bank.insertAccount(account);
                operateAccount(account);
            } else if (op.equals("R")) {
                System.out.println("Select the account number to remove:\n");
                List<Account> accounts = bank.getAccounts();
                for (Account account : accounts){
                    log.info(account);
                }
                int n = scanner.nextInt();
                bank.removeAccount(accounts.get(n-1));
                for (Account account : accounts){
                    log.info(account);
                }
            } else if (op.equals("E")) {
                break;
            } else {
                System.out.println("Invalid option!\n");
            }
            scanner = new Scanner(System.in);
        }
    }

    static void operateAccount(Account account){
        Scanner scanner = new Scanner(System.in);
        Log log = new Log();

        while(true){
            System.out.println("Choose an option -> D-Deposit | W-Withdraw | E-Exit");
            String op = scanner.nextLine();

            if(op.equals("D")){
                System.out.println("How much do you want to deposit?");
                double v = scanner.nextDouble();
                account.deposit(v);
            }else if(op.equals("W")){
                System.out.println("How much do you want to withdraw?");
                double v = scanner.nextDouble();
                account.withdraw(v);
            }else if(op.equals("E")){
                break;
            }else {
                System.out.println("Invalid option!\n");
            }
            scanner = new Scanner(System.in);
        }
    }
}
