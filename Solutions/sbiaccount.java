import java.util.*;
import java.lang.Math;

class SBIBankAccount {

    protected double balance;
    protected String accountno;
    Random rand = new Random ();
    public void openAccount() {
        accountno = "SBI"+rand.nextInt(1000000);
        balance = 0;
        System.out.println("Account created with account number "+ accountno);
    }

    public void deposit (double amount) {
        balance += amount;
        System.out.println("Current balance : "+balance);
    }

    public void withdraw (double amount) {
        if (balance-amount>=0) {
            balance -= amount;
            System.out.println("Current balance : "+balance);
        }
        else
            System.out.println("Not enough balance to withdraw.");
    }

}

class premiumAccount extends SBIBankAccount {

    private double minBalance = 5000;

    @Override
    public void openAccount() {
        accountno = "SBI"+rand.nextInt(1000000);
        balance = minBalance;
        System.out.println("Premium Account created with account number "+ accountno);
    }

    @Override
    public void deposit (double amount) {
        super.deposit(amount);
    }

    @Override
    public void withdraw (double amount) {
        if (balance-amount >= minBalance) {
        balance -= amount;
        System.out.println("Current balance : "+balance);
        }
        else
        System.out.println("Minium balance of 5000 should be maintained.");
    }

}

class jundhanAccount extends SBIBankAccount {

    private double minBalance = 0;

    @Override
    public void openAccount() {
        accountno = "SBI"+rand.nextInt(1000000);
        balance = 0;
        System.out.println("Jundhan Account created with account number "+ accountno);
    }

    @Override
    public void deposit (double amount) {
        super.deposit(amount);
    }

    @Override
    public void withdraw (double amount) {
        super.withdraw(amount);
    }

}

public class sbiaccount {
    public static void main (String [] args) {

        premiumAccount pac = new premiumAccount();
        jundhanAccount jac = new jundhanAccount();

        pac.openAccount();
        pac.deposit(2000);
        pac.withdraw(2000);
        pac.withdraw(100);

        jac.openAccount();
        jac.deposit(1000);
        jac.withdraw(800);
        jac.withdraw(201);
    }
}
