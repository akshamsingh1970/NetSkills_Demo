import java.util.ArrayList;
import java.util.List;

public class banking {
    public static void main(String[] args){
        CurrentAccount c1 = new CurrentAccount();
        Bank.add(c1);
        System.out.println(Bank.accs);
        c1.deposit(1000);
        System.out.println("Balance: " + c1.getBalance());
        c1.withdraw(500);
        System.out.println("Balance: " + c1.getBalance());
        c1.withdraw(1000);
        System.out.println("Interest on current balance: "+c1.calculateInterest());


        System.out.println();
        SavingsAccount s1 = new SavingsAccount();
        Bank.add(s1);
        System.out.println(Bank.accs);
        s1.deposit(1000);
        System.out.println("Balance: " + s1.getBalance());
        s1.withdraw(500);
        System.out.println("Balance: " + s1.getBalance());
        s1.withdraw(1000);
        System.out.println("Interest on current balance: "+s1.calculateInterest());    
    }
}

interface Account{
    int deposit(int n);
    int withdraw(int n);
    float calculateInterest();
    int getBalance();
}

class SavingsAccount implements Account{
    private int interestPercentage = 8;
    int balance = 0;

    
    public int deposit(int n){
        balance+=n;
        return balance;
    }

    public int withdraw(int n){
        if (balance-n>0){
            balance -= n;
            return balance;
        }
        else{
            System.out.println("Balance Insufficient");
            return -1;
        }
    }

    public float calculateInterest(){
        float interest = (interestPercentage * balance)/100;
        return interest;
    }

    public int getBalance(){
        return balance;
    }
}

class CurrentAccount implements Account{
    private int interestPercentage = 4;
    int balance = 0;

    public int deposit(int n){
        balance+=n;
        return balance;
    }

    public int withdraw(int n){
        if (balance-n>0){
            balance -= n;
            return balance;
        }
        else{
            System.out.println("Balance Insufficient");
            return -1;
        }
    }

    public float calculateInterest(){
        float interest = (interestPercentage * balance)/100;
        return interest;
    }

    public int getBalance(){
        return balance;
    }
}

class Bank{
    static  List<Account> accs = new ArrayList<Account>();

    public static void add(Account acc){
        accs.add(acc);
    }
}
