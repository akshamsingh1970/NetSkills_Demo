import java.util.ArrayList;
import java.util.List;

public class BankingSystem {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Creating savings account
        SavingsAccount savingsAccount = new SavingsAccount(200);
        bank.addAccount(savingsAccount);

        // Depositing, withdrawing, finding interest and getting balance from savings account
        bank.deposit(savingsAccount, 200);
        bank.withdraw(savingsAccount, 1000);
        bank.withdraw(savingsAccount, 200);
        bank.calculateInterest(savingsAccount);
        bank.showBalance(savingsAccount);

        System.out.print("\n");
        // Creating current account
        CurrentAccount currentAccount = new CurrentAccount(1000);
        bank.addAccount(currentAccount);

        // Depositing, withdrawing, finding interest and getting balance from current account
        bank.deposit(currentAccount, 1000);
        bank.withdraw(currentAccount, 3000);
        bank.withdraw(currentAccount, 1000);
        bank.calculateInterest(currentAccount);
        bank.showBalance(currentAccount);

        System.out.print("\n");
        // Get all accounts balance
        bank.showAccounts();

        System.out.print("\n");
        // Removing savings and current account from bank
        bank.removeAccount(savingsAccount);
        bank.removeAccount(currentAccount);
    }
}

interface Account {
    void deposit(int amount);
    void withdraw(int amount);
    double calculateInterest();
    int showBalance();
}

class SavingsAccount implements Account {
    private int balance;
    
    public SavingsAccount(int initBalance) {
        balance = initBalance;
        System.out.println("Created new saving account with balance " + initBalance);
    }

    @Override
    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited " + amount);
    }

    @Override
    public void withdraw(int amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount);
        }
        else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public double calculateInterest() {
        // Savings account has 5% interest
        return balance * 0.05;
    }

    @Override
    public int showBalance() {
        return balance;
    }
}

class CurrentAccount implements Account {
    private int balance;
    
    public CurrentAccount(int initBalance) {
        balance = initBalance;
        System.out.println("Created new current account with balance " + initBalance);
    }

    @Override
    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited " + amount);
    }

    @Override
    public void withdraw(int amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount);
        }
        else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public double calculateInterest() {
        // Savings account has 0% interest
        return balance * 0.0;
    }

    @Override
    public int showBalance() {
        return balance;
    }
}

class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added to bank");
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
        System.out.println("Account removed from bank");
    }

    public void showAccounts() {
        System.out.println("Accounts: ");
        for(Account account : accounts) {
            System.out.println("Balance: " + account.showBalance());
        }
    }

    public void deposit(Account account, int amount) {
        account.deposit(amount);
    }

    public void withdraw(Account account, int amount) {
        account.withdraw(amount);
    }

    public void calculateInterest(Account account) {
        System.out.println("Interest: " + account.calculateInterest());
    }

    public void showBalance(Account account) {
        System.out.println("Balance: " + account.showBalance());
    }
}
