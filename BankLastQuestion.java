
import java.lang.*;
import java.io.*;
import java.util.*;

interface Account{
    void deposit(double amount);
    void withdraw(double amount);
    double calculateInterest();
    double viewBalance();
}

class SavingsAccount implements Account{
    double balanceAmount;
    double principalAmount;
    String holderName;
    double interestRate;
    SavingsAccount(double b,double i,String s){
        this.balanceAmount=b;
        this.principalAmount=b;
        this.interestRate=i;
        this.holderName=s;
    }
    @Override public void deposit(double amount){
        balanceAmount+=amount;
        System.out.println(amount +" Amount has been deposited!");
    }
    @Override public void withdraw(double amount){
        if(balanceAmount>=amount){
        balanceAmount-=amount;
        System.out.println("Balance "+balanceAmount+" is left in the Account");}else{
            System.out.println("You dont have that much money in your Account!");
        }
    }
    @Override public double calculateInterest(){
        double addingAmount=principalAmount*interestRate/100;
        return addingAmount;
    }
    @Override public double viewBalance(){
       return this.balanceAmount;
    }
    public String viewAccountantName(){
        //System.out.println(this.holderName);
        return this.holderName;
    }

}

class CurrentAccount implements Account{
    double balanceAmount;
    double overLimit;
    String holderName;
    CurrentAccount(double b,double i,String s){
        this.balanceAmount=b;
        this.overLimit=i;
        this.holderName=s;
    }
    @Override public  void deposit(double amount){
        balanceAmount+=amount;
        System.out.println(amount +" Amount has been deposited!");
    }
    @Override public void withdraw(double amount){
        if(balanceAmount+overLimit>=amount){
        balanceAmount-=amount;
        System.out.println("Balance "+balanceAmount+" is left in the Account");}else{
            System.out.println("Limit Reached!");
        }
    }
    @Override public double calculateInterest(){
        return 0;
    }
    @Override public double viewBalance(){
       return this.balanceAmount;
    }
    public String viewAccountantName(){
        return this.holderName;
        //System.out.println(this.holderName);
    }

}


class Bank{
    ArrayList<SavingsAccount> arrayOfSavings;
    ArrayList<CurrentAccount> arrayOfCurrent;
    Bank(){
        arrayOfCurrent=new ArrayList<CurrentAccount>();
        arrayOfSavings=new ArrayList<SavingsAccount>();
    }
    public void addSavingsAccount(SavingsAccount s1){
        arrayOfSavings.add(s1);
    }
    public void addCurrentAccount(CurrentAccount c1){
        arrayOfCurrent.add(c1);
    }
    public void removeSavingsAccount(SavingsAccount s1){
        arrayOfSavings.remove(s1);
    }
     public void removeCurrentAccount(CurrentAccount c1){
        arrayOfCurrent.remove(c1);
    }
    public void addDepositSavings (SavingsAccount s2, double amount){
        s2.deposit(amount);
    }
    public void addDepositCurrent(CurrentAccount c2,double amount){
        c2.deposit(amount);
    }

    public void printBalances(){
        System.out.println("Balances of Savings Account: ");
        for(SavingsAccount s: arrayOfSavings){
            System.out.println("Balance in the "+ s.viewAccountantName() +" Savings Account is "+ s.viewBalance());
        }
        System.out.println("Balances of Current Account: ");
        for(CurrentAccount c: arrayOfCurrent){
            System.out.println("Balance in the "+c.viewAccountantName()+" Current Account is: "+c.viewBalance());
        }
    }

}

class BankLastQuestion{
     public static void main(String[] args){
        Bank bank=new Bank();
        SavingsAccount saving=new SavingsAccount(9000,1.25,"Hemanth");
        SavingsAccount saving1=new SavingsAccount(9000,1.25,"Harish");
        CurrentAccount current=new CurrentAccount(1800,1000,"Krishna");
        CurrentAccount current1=new CurrentAccount(1800,1000,"Kishore");

        bank.addSavingsAccount(saving);
        bank.addSavingsAccount(saving1);

        bank.addCurrentAccount(current);
        bank.addCurrentAccount(current1);

        bank.addDepositSavings(saving1,1000);
        bank.addDepositCurrent(current,1090);

        bank.printBalances();

        bank.removeCurrentAccount(current1);

        bank.printBalances();
        System.out.println("Savings account of "+saving1.viewAccountantName()+" is: "+saving1.viewBalance());


     }

}