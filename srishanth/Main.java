

import java.util.ArrayList;

import java.util.List;


interface Account {

    void deposit(double amount);

    void withdraw(double amount);

    double calculateInterest();

    double viewBalance();

}


class SavingsAccount implements Account {

    private double balance;

    public void deposit(double amount) {

        balance += amount;

    }


    public void withdraw(double amount) {

        if (balance >= amount) {

            balance -= amount;

        } else {

            System.out.println("Insufficient balance!");

        }

    }

    public double calculateInterest() {

        return balance * 0.05;

    }

    public double viewBalance() {

        return balance;

    }


    public void performSavingsAccountSpecificOperation() {

        System.out.println("Performing savings account specific operation...");

    }

}


class CurrentAccount implements Account {

    private double balance;


   

    public void deposit(double amount) {

        balance += amount;

    }



    public void withdraw(double amount) {

        if (balance >= amount) {

            balance -= amount;

        } else {

            System.out.println("Insufficient balance!");

        }

    }


   

    public double calculateInterest() {

        return balance * 0.01;

    }



    public double viewBalance() {

        return balance;

    }


    public void performCurrentAccountSpecificOperation() {

        System.out.println("Performing current account specific operation...");


    }

}


class Bank {

    private List<Account> accounts;


    public Bank() {

        accounts = new ArrayList<>();

    }


    public void addAccount(Account account) {

        accounts.add(account);

    }


    public void depositToAccount(int accountIndex, double amount) {

        Account account = accounts.get(accountIndex);

        account.deposit(amount);

    }


    public void withdrawFromAccount(int accountIndex, double amount) {

        Account account = accounts.get(accountIndex);

        account.withdraw(amount);

    }


    public double calculateInterestForAccount(int accountIndex) {

        Account account = accounts.get(accountIndex);

        return account.calculateInterest();

    }


    public double viewBalanceForAccount(int accountIndex) {

        Account account = accounts.get(accountIndex);

        return account.viewBalance();

    }

}


public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank();


        SavingsAccount savingsAccount = new SavingsAccount();

        savingsAccount.deposit(1000);

        bank.addAccount(savingsAccount);


        CurrentAccount currentAccount = new CurrentAccount();

        currentAccount.deposit(2000);

        bank.addAccount(currentAccount);


    }}