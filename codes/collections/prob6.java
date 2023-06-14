package NetSkills_Demo.codes.collections;
import java.util.ArrayList;
import java.util.List;

public class prob6 {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Create savings account and perform operations
        SavingsAccount savingsAccount = new SavingsAccount(1000.0, 0.05);
        savingsAccount.deposit(500.0);
        savingsAccount.withdraw(200.0);
        double interest = savingsAccount.calculateInterest();
        double balance = savingsAccount.viewBalance();
        System.out.println("Savings Account - Balance: " + balance + ", Interest: " + interest);
        savingsAccount.applyCompoundInterest();
        balance = savingsAccount.viewBalance();
        System.out.println("Savings Account (After Interest): " + balance);

        // Create current account and perform operations
        CurrentAccount currentAccount = new CurrentAccount(2000.0, 1000.0);
        currentAccount.deposit(300.0);
        currentAccount.withdraw(2500.0);
        balance = currentAccount.viewBalance();
        System.out.println("Current Account - Balance: " + balance);

        // Add accounts to the bank
        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);
    }
}

interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double calculateInterest();
    double viewBalance();
}

class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }
}

class SavingsAccount implements Account {
    private double balance;
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override
    public double viewBalance() {
        return balance;
    }

    public void applyCompoundInterest() {
        double interest = calculateInterest();
        balance += interest;
    }
}

class CurrentAccount implements Account {
    private double balance;
    private double overdraftLimit;

    public CurrentAccount(double balance, double overdraftLimit) {
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    public double calculateInterest() {
        return 0; // Current account does not earn interest
    }

    @Override
    public double viewBalance() {
        return balance;
    }
}


