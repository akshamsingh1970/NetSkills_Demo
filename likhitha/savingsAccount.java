import java.util.*;

// Account interface
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double calculateInterest();
    double viewBalance();
}

// SavingsAccount class implementing Account interface
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
        System.out.println("Amount " + amount + " deposited successfully to Savings Account.");
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount " + amount + " withdrawn successfully from Savings Account.");
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
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

    public void addInterest() {
        double interest = calculateInterest();
        balance += interest;
        System.out.println("Interest added to Savings Account: " + interest);
    }
}

// CurrentAccount class implementing Account interface
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
        System.out.println("Amount " + amount + " deposited successfully to Current Account.");
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Amount " + amount + " withdrawn successfully from Current Account.");
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }

    @Override
    public double calculateInterest() {
        return 0; // Current account doesn't earn interest
    }

    @Override
    public double viewBalance() {
        return balance;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
        System.out.println("Overdraft limit updated: " + overdraftLimit);
    }
}

// Bank class
class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }
}

// Main class to test the banking system
class savings {
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingsAccount savingsAccount = new SavingsAccount(5000, 0.05);
        bank.addAccount(savingsAccount);

        CurrentAccount currentAccount = new CurrentAccount(2000, 5000);
        bank.addAccount(currentAccount);

        savingsAccount.deposit(1000);
        savingsAccount.withdraw(2000);
        double savingsBalance = savingsAccount.viewBalance();
        System.out.println("Savings Account Balance: " + savingsBalance);

        currentAccount.deposit(3000);
        currentAccount.withdraw(5000);
        double currentBalance = currentAccount.viewBalance();
        System.out.println("Current Account Balance: " + currentBalance);

        savingsAccount.addInterest();
        double updatedSavingsBalance = savingsAccount.viewBalance();
        System.out.println("Updated Savings Account Balance: " + updatedSavingsBalance);

        currentAccount.setOverdraftLimit(10000);
    }
}





