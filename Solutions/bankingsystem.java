import java.util.*;

interface account {
    void deposit(double amount);
    void withdraw(double amount);
    void calculateInterst();
    void viewBalance();
}

class Bank {

    List<String> accounts = new ArrayList<>();

    public void addAccount (String acc) {
        accounts.add(acc);
        System.out.println("New account with account number "+acc+" added.");
    }

    public void viewAccounts() {
        System.out.println("List of accounts: ");
        for(int i=0;i<accounts.size();i++) {
            System.out.print(accounts.get(i)+" ");
        }
        System.out.println("");
    }
}

class SavingsAccount implements account {
    
    public String accountno;
    public double balance;
    public double interestrate;
    Random rand = new Random ();

    public SavingsAccount() {
        this.accountno = "AC"+rand.nextInt(10000000);
        this.balance = 0;
        this.interestrate = 0.05;
        System.out.println("Savings account with account number "+accountno+" created.");
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (this.balance-amount>=0) {
            this.balance -= amount;
            System.out.println("Current balance of : "+this.balance);
        }
        else
            System.out.println("Not enough balance to withdraw.");
    }

    public void calculateInterst() {
        double interest = this.balance*interestrate*1;
        System.out.println("Interest a year : "+interest);
    }

    public void viewBalance() {
        System.out.println("Current Balance is "+ this.balance);
    }

}

class CurrentAccount implements account{
    
    public String accountno;
    public double balance;
    public double interestrate;
    Random rand = new Random ();

    public CurrentAccount() {
        this.accountno = "AC"+rand.nextInt(10000000);
        this.balance = 0;
        this.interestrate = 0;
        System.out.println("Current account with account number "+accountno+" created.");
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (this.balance-amount>=0) {
            this.balance -= amount;
            System.out.println("Current balance : "+this.balance);
        }
        else
            System.out.println("Not enough balance to withdraw.");
    }

    public void calculateInterst() {
        double interest = this.balance*interestrate*1;
        System.out.println("Interest a year : "+interest);
    }

    public void viewBalance() {
        System.out.println("Current Balance is "+ this.balance);
    }

}

public class bankingsystem {
    public static void main(String [] args) {
        Bank objB = new Bank();
        // objB.viewAccounts();

        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1 to create savings account; 2 to create current account; 3 to view accounts");
        int inp = s.nextInt();
        int inp1;
        double inp2;
        if (inp==1) {
            SavingsAccount sac = new SavingsAccount();
            objB.addAccount(sac.accountno);
            while (true) {
            System.out.println("Enter 1 - deposit; 2 - withdraw; 3 - view balance; 4 - calculate interst; 5 - list accounts; 6 - exit");
            inp1 = s.nextInt();
            if(inp1==6)
            break;
            switch (inp1) {
                case 1:
                    System.out.println("Enter amount: ");
                    inp2 = s.nextDouble();
                    sac.deposit(inp2);
                    break;
                case 2:
                    System.out.println("Enter amount: ");
                    inp2 = s.nextDouble();
                    sac.withdraw(inp2);
                    break;
                case 3:
                    sac.viewBalance();
                    break;
                case 4:
                    sac.calculateInterst();
                    break;
                case 5:
                    objB.viewAccounts();
            }
            }
        }
        else if (inp==2) {
            CurrentAccount pac = new CurrentAccount();
            objB.addAccount(pac.accountno);
            while (true) {
            System.out.println("Enter 1 - deposit; 2 - withdraw; 3 - view balance; 4 - calculate interst; 5 - list accounts; 6 - exit");
            inp1 = s.nextInt();
            if(inp1==6)
            break;
            switch (inp1) {
                case 1:
                    System.out.println("Enter amount: ");
                    inp2 = s.nextDouble();
                    pac.deposit(inp2);
                    break;
                case 2:
                    System.out.println("Enter amount: ");
                    inp2 = s.nextDouble();
                    pac.withdraw(inp2);
                    break;
                case 3:
                    pac.viewBalance();
                    break;
                case 4:
                    pac.calculateInterst();
                    break;
                case 5:
                    objB.viewAccounts();
            }
            }
        }
        else {
            System.out.println("Enter valid option!");
        }


        // SavingsAccount sac = new SavingsAccount();
        // objB.addAccount(sac.accountno);
        // objB.viewAccounts();

        // CurrentAccount cac = new CurrentAccount();
        // objB.addAccount(cac.accountno);
        // objB.viewAccounts();

        // System.out.println("Operations on Savings account");
        // sac.viewBalance();
        // sac.deposit(1000);
        // sac.viewBalance();
        // sac.withdraw(745);
        // sac.calculateInterst();

        // System.out.println("Operations on Current account");
        // cac.viewBalance();
        // cac.deposit(8000);
        // cac.withdraw(200);
        // cac.calculateInterst();
        // cac.viewBalance();
    }
}