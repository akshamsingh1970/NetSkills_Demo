/* Write a Java program to create a class known as "SBIBankAccount" 
with methods called deposit() and withdraw().
And create opening account method openAccount.
create sub classes for premiumAccount and jundhanAccount and override the deposit, 
withdraw, and openAccount in sub class. 
Where if you open premium account should be start from 5K and your jundhanAccount 
start from 0 balance.
where withdraw() method to prevent withdrawals if the account balance falls 
below 5K for the premium account and prevent withdrawals if the account balance falls 
below 0 for the jundhanAccount.
*/
class SBIBankAccount{
    protected int balance;
    public void deposit(int amount){

    }
    public void withdraw(int amount){

    }
    public void openAccount(int openingBalance){

    }
}
class premiumAccount extends SBIBankAccount{
    public void deposit(int amount){
        balance += amount;
    } 
    public void withdraw(int amount){
        if(balance - amount < 5000) System.out.println("Withdraw Unsuccessful as balance is : " + balance);
        else{
            balance -= amount;
            System.out.println("Withdraw Successful : Current balance : "+balance);
        }
    } 
    public void openAccount(int openingBalance){
        if(openingBalance < 5000)   System.out.println("Minimum Balance : 5000");
        else{
            System.out.println("Account Creation Successful");
            deposit(openingBalance);
        }
    }
    public void getBalance(){
        System.out.println(balance);
    }
}
class jundhanAccount extends SBIBankAccount{
    public void deposit(int amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposit Successful : Current Balance : " + balance);
        }
        else{
            System.out.println("Amount Invalid");
        }
    } 
    public void withdraw(int amount){
        if(balance - amount > 0){
            balance -= amount;
            System.out.println("Withdraw Successful : Current Balance : " + balance);
        }
        else{
            balance -= amount;
            System.out.println("Withdraw Successful : Current balance : " + balance);
        }
    } 
    public void openAccount(int openingBalance){
        if(openingBalance > 0){
            System.out.println("Account Creation Successful");
            deposit(openingBalance);
        }
    }
    public void getBalance(){
        System.out.println(balance);
    }
}
public class Bank{
    public static void main(String[] args){
        jundhanAccount account1 = new jundhanAccount();
        account1.openAccount(6000);
        account1.withdraw(2000);
        account1.deposit(200);
        premiumAccount account2 = new premiumAccount();
        account2.openAccount(5000);
        account2.deposit(200);
        account2.withdraw(400);
    }
}