/* 

5->
Write a Java program to create a class known as "SBIBankAccount" 
with methods called deposit() and withdraw().
And create opening account methos openAccount.
create sub classes for premiumAccount and jundhanAccount and override the deposit, 
withdraw, and openAccount in sub class. 
Where if you open premium account should be start from 5K and your jundhanAccount 
start from 0 balance.
where withdraw() method to prevent withdrawals if the account balance falls 
below 5K for the premium account and prevent withdrawals if the account balance falls 
below 0 for the jundhanAccount.

*/

class SBIBankAccount{
    protected String holder;
    protected int balance;
    protected String type;

    public void deposit(int amount){
        // check if acc is opened or not
        if(amount <= 0){
            System.out.println("deposit amt invalid!!!");
        }else{
            balance+=amount;
            System.out.println("Amt deposit: "+amount+", Balance: "+balance);
        }
    }
    public void withdraw(int amount){}
    public void openAccount(String name, int iniDeposit){}
}

class premiumAccount extends SBIBankAccount{
    public void withdraw(int amount){
        if(balance - amount >= 5000){
            balance-=amount;
            System.out.println("amt withdrawn: "+amount+", balance: "+balance);
        }else{
            System.out.println("Low Balance!!!");
        }
    }
    public void openAccount(String name, int iniDeposit){
        System.out.println("-----Welcome to SBI-----\nOpening premium account...");
        if(iniDeposit < 5000){
            System.out.println("Sorry: min deposit to open premium acc is 5000!");
        }else{
            holder = name;
            balance = iniDeposit;
            type = "premium";
            System.out.println("Account opening success!!! \n----------\nAcc Name: "+holder+"\nBalance: "+balance+"\nType: "+type+"\n----------");
        }
    }
}

class jandhanAccount extends SBIBankAccount{
    public void withdraw(int amount){
        
        if(balance - amount >= 0){
            balance-=amount;
            System.out.println("amt withdrawn: "+amount+", balance: "+balance);
        }else{
            System.out.println("Low Balance!!!");
        }
    }
    public void openAccount(String name, int iniDeposit){
        System.out.println("-----Welcome to SBI-----\n Opening jandhan account...");
        if(iniDeposit <= 0){
            System.out.println("Sorry: deposit amt is not valid.");
        }else{
            holder = name;
            balance = iniDeposit;
            type = "jandhan";
            System.out.println("Account opening success!!! \n----------\nAcc Name: "+holder+"\nBalance: "+balance+"\nType: "+type+"\n----------");
        }
    }
}

class Fifth{
    public static void main(String args[]){
        SBIBankAccount mera = new jandhanAccount();
        mera.openAccount("Saurabh",6000);
        mera.deposit(1200);
    }
}