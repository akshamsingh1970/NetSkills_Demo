/* Write a Java programming to create a banking system with three classes - 
Bank, Account, SavingsAccount, and CurrentAccount. The bank should have a list of 
accounts and methods for adding them. Accounts should be an interface with methods 
to deposit, withdraw, calculate interest, and view balances. SavingsAccount and 
CurrentAccount should implement the Account interface and have their own unique 
methods.
 */
interface Account{

    public void deposit(int val);

    public void withdraw(int val);

    public Float interest();

    public int getBalance();

}




class SavingsAccount implements Account{

    private int balance;

    public int minBalance = 2000;

    SavingsAccount(int val){

        this.balance = val;

    }

    public void deposit(int val){

        this.balance+=val;

    }

    public void withdraw(int val){

        if(this.balance-val>=this.minBalance){

            this.balance-=val;

        }

        else{

            System.out.println("Your Account should have a minimum balance of "+this.minBalance);

        }

    }

    public Float interest(){

        return 0.0f;

    }

    public int getBalance(){

        return this.balance;

    }

}




class CurrentAccount implements Account{

    private int balance;

    public int minBalance = 10000;

    public Float rate = 10.0f;

    CurrentAccount(int val){

        this.balance = val;

    }

    public void deposit(int val){

        this.balance+=val;

    }

    public void withdraw(int val){

        this.balance-=val;

    }

    public Float interest(){

        int time = 12;

        return ((this.minBalance-this.balance)*rate)/time;

    }

    public int getBalance(){

        return this.balance;

    }

}




public class Bank2{

    public static void main(String[] args){

        SavingsAccount a = new SavingsAccount(3000);

        System.out.println("Your Account Balance is: "+a.getBalance());

    }

}