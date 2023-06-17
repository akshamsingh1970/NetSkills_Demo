public class SBIBankAccout {
    public static void main(String[] args) {
        BankAccount mySBIAccount = new BankAccount();
        mySBIAccount.createAccount();
        mySBIAccount.deposit(20);
        mySBIAccount.withdraw(30);
        mySBIAccount.withdraw(10);

        System.out.print("\n");
        BankAccount myPremiumAccount = new premiumAccount();
        myPremiumAccount.createAccount();
        myPremiumAccount.deposit(20);
        myPremiumAccount.withdraw(30);
        myPremiumAccount.withdraw(10);

        System.out.print("\n");
        BankAccount myJundhanAccount = new jundhanAccount();
        myJundhanAccount.createAccount();
        myJundhanAccount.deposit(20);
        myJundhanAccount.withdraw(30);
        myJundhanAccount.withdraw(10);
    }
}  

class BankAccount {
    public int balance;
    public void createAccount() {
        balance = 0;
        System.out.println("Created SBI Bank Account with balance " + balance);
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited amount " + amount + ", final balance " + balance);
    }

    public void withdraw(int amount) {
        if(balance - amount < 0) {
            System.out.println("Cannot withdraw " + amount + ", insufficient balance " + balance);
        }
        else {
            balance -= amount;
            System.out.println("Amount withdrawn " + amount + ", final balance " + balance);
        }
    }
}

class premiumAccount extends BankAccount {
    @Override public void createAccount() {
        balance = 5000;
        System.out.println("Created SBI Premium Bank Account with balance " + balance);
    }

    @Override public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited amount " + amount + ", final balance in premium account " + balance);
    }

    @Override public void withdraw(int amount) {
        if(balance - amount < 5000) {
            System.out.println("Cannot withdraw " + amount + ", insufficient balance in premium account " + balance);
        }
        else {
            balance -= amount;
            System.out.println("Amount withdrawn " + amount + ", final balance in premium account " + balance);
        }
    }
}

class jundhanAccount extends BankAccount {
    @Override public void createAccount() {
        balance = 0;
        System.out.println("Created SBI Jundhan Bank Account with balance " + balance);
    }

    @Override public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited amount " + amount + ", final balance in Jundhan account " + balance);
    }

    @Override public void withdraw(int amount) {
        if(balance - amount < 0) {
            System.out.println("Cannot withdraw " + amount + ", insufficient balance in Jundhan account " + balance);
        }
        else {
            balance -= amount;
            System.out.println("Amount withdrawn " + amount + ", final balance in Jundhan account " + balance);
        }
    }
}