package NetSkills_Demo.codes.collections;
public class prob5 {
    public static void main(String[] args){
        PremiumAccount p = new PremiumAccount();
        p.openAccount();
        p.deposit(100);
        p.withdraw(200.0);
        p.viewBalance();
        
        JanDhanAccount j = new JanDhanAccount();
        j.openAccount();
        j.deposit(100.0);
        j.withdraw(200.0);
        j.viewBalance();
    }
}

class BankAccount {
    protected String accountNumber;
    protected double balance;
    
    void openAccount(){
        this.balance = 0.0;
    }

    void deposit(double amount){
        balance += amount;
    }

    void withdraw(double amount){
        if(balance - amount >= 0){
            balance -= amount;
        }
        else {
            System.out.println("Insufficient balance");
        }
    }
    
    void viewBalance(){
        System.out.println("Your balance is " + balance);
    }
}

class PremiumAccount extends BankAccount {
    void openAccount() {
        this.balance = 5000.0;
    }
    
    void deposit(double amount){
        balance += amount;
    }

    void withdraw(double amount){
        if(balance > 5000.0 && balance - amount >= 0){
            balance -= amount;
        }
        else {
            System.out.println("Insufficient balance");
        }
    }
}

class JanDhanAccount extends BankAccount {
    void openAccount() {
        this.balance = 5000.0;
    }
    
    void deposit(double amount){
        balance += amount;
    }

    void withdraw(double amount){
        if(balance > 0 && balance - amount >= 0){
            balance -= amount;
        }
        else {
            System.out.println("Insufficient balance");
        }
    }
}
