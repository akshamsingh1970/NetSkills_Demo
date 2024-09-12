package HomeWork3;
import java.util.*;

interface Account {
    void deposit(double amount);

    void withdraw(double amount);

    void calculateInterest();

    void viewBalance();

    String getName();
}

class SavingsAccount implements Account {
    private String name;
    private double balance;

    public SavingsAccount(String name) {
        this.name = name;
        this.balance = 0.0;
    }

    
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    
    public void calculateInterest() {
        double interest = balance * 0.05; // Assuming 5% interest rate
        balance += interest;
        System.out.println("Calculated interest: " + interest);
    }

    
    public void viewBalance() {
        System.out.println("Balance: " + balance);
    }

    
    public String getName() {
        return name;
    }

}

class CurrentAccount implements Account {
    private String name;
    private double balance;

    public CurrentAccount(String name) {
        this.name = name;
        this.balance = 0.0;
    }

    
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    
    public void calculateInterest() {
        System.out.println("No interest calculation for current account");
    }

    
    public void viewBalance() {
        System.out.println("Balance: " + balance);
    }

    
    public String getName() {
        return name;
    }

}

class Bank {
    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void showAccounts() {
        for (Account account : accounts) {
            System.out.println("Account Name: " + account.getName());
            account.viewBalance();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank();

        Random random = new Random();

        SavingsAccount savingsAccount = new SavingsAccount("" + Math.round(random.nextFloat() * Math.pow(10, 12)));
        CurrentAccount currentAccount = new CurrentAccount("" + Math.round(random.nextFloat() * Math.pow(10, 12)));

        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        bank.showAccounts();
    }

}
