import java.util.ArrayList;
import java.util.List;

public class Bank {
    static List<SavingsAccount> SAList;
    static List<CurrentAccount> CAList;
    public static void main(String[] args) {
        SAList = new ArrayList<>();
        CAList = new ArrayList<>();

        Bank b1 = new Bank();
        b1.addCurrentAccount(10000);
        b1.addSavingsAccount(4000);

    }

    public void addSavingsAccount(int amount) {
        SavingsAccount SA = new SavingsAccount(amount);
        SAList.add(SA);
    }

    public void addCurrentAccount(int amount) {
        CurrentAccount CA = new CurrentAccount(amount);
        CAList.add(CA);
    }

}

interface Account{
    public void deposit(int amount);
    public void withdraw(int amount);
    public void calculateInterest();
    public void viewBalance();
}

class SavingsAccount implements Account{
    int balance;

    public SavingsAccount(int balance)  {
        this.balance = balance;
    }

    @Override
    public void deposit(int amount) {
        balance += amount;
    }

    @Override
    public void withdraw(int amount) {
        if(balance-amount<0)    {
            System.out.println("Not possible to deduct: Balance is: Rs. "+balance);
        }
        else{
            balance -= amount;
            System.out.println("Amount deducted, now balance is: Rs. "+balance);
        }
    }

    @Override
    public void calculateInterest() {
        System.out.println("Interest for savings account is: ");
    }

    @Override
    public void viewBalance() {
        System.out.println("Your balance is: Rs. "+balance);
    }

}

class CurrentAccount implements Account {
    int balance;

    public CurrentAccount(int balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(int amount) {
        balance += amount;
    }

    @Override
    public void withdraw(int amount) {
        if(balance-amount<0)    {
            System.out.println("Not possible to deduct: Balance is: Rs. "+balance);
        }
        else{
            balance -= amount;
            System.out.println("Amount deducted, now balance is: Rs. "+balance);
        }
    }

    @Override
    public void calculateInterest() {
        System.out.println("Interest for current account is: ");
    }

    @Override
    public void viewBalance() {
        System.out.println("Your balance is: Rs. "+balance);
    }

}