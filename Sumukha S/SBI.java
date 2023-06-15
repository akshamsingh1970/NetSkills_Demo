import java.util.Scanner;
class SBIBankAccount{
    static int balance;
    void deposit(int amount){
        System.out.println("amount deposited");
    }
    void withdraw(int amount){
        
    }
    void openAccount(){
        System.out.println("amount deposited");
    }
}

class PremiumAccount extends SBIBankAccount{
    void deposit(int amount){
        balance = balance+amount;
        System.out.println("amount deposited");
        System.out.println("current balance = "+balance);
    }
    void withdraw(int amount){
        if(amount>balance || balance-amount<=5000){
            System.out.println("Withdrawl not possible due to low balance");
        }
        else{
            balance = balance - amount;
            System.out.println("Withdrawl successfull, current balance:"+balance);
        }
    }
    void openAccount(int dep){
        if(dep>=5000){
            System.out.println("New Premium account opened");
            balance = dep;
        }
        else{
            System.out.println("Account cannot be created with less than 5k deposit ");
        }
    }
}

class JundhanAccount extends SBIBankAccount{
    void deposit(int amount){
        balance = balance+amount;
        System.out.println("amount deposited");
        System.out.println("current balance = "+balance);
    }
    void withdraw(int amount){
        if(amount>balance || balance-amount<=0){
            System.out.println("Withdrawl not possible due to low balance");
        }
        else{
            balance = balance - amount;
        }
    }
    void openAccount(int dep){
        System.out.println("New Jundhan Account opened with a deposit of "+dep);
        balance = dep;
    }
}

class SBI{
    public static void main(String args[]){
        PremiumAccount pre = new PremiumAccount();
        JundhanAccount jun = new JundhanAccount();
        Scanner sc = new Scanner(System.in);
        int accchoice,deposit;
        System.out.println("enter choice of account : 1 - Premium 2 - Jundhan for opening");
        accchoice = sc.nextInt();
        switch(accchoice){
            case 1:
                System.out.println("enter amount to be deposited");
                deposit = sc.nextInt();
                pre.openAccount(deposit);
                break;
            case 2:
                System.out.println("enter amount to be deposited");
                deposit = sc.nextInt();
                jun.openAccount(deposit);
                break;
            default:
                System.out.println("Invalid Choice");
        }
        System.out.println("enter choice of account : 1 - Premium 2 - Jundhan for deposit");
        int depchoice = sc.nextInt();
        switch(depchoice){
            case 1:
                System.out.println("enter amount to be deposited");
                deposit = sc.nextInt();
                pre.deposit(deposit);
                break;
            case 2:
                System.out.println("enter amount to be deposited");
                deposit = sc.nextInt();
                jun.deposit(deposit);
                break;
            default:
                System.out.println("Invalid Choice");
        }

        System.out.println("enter choice of account : 1 - Premium 2 - Jundhan for withdrawl");
        int wchoice = sc.nextInt();
        switch(wchoice){
            case 1:
                
                System.out.println("enter amount to be withdrawn");
                deposit = sc.nextInt();
                pre.withdraw(deposit);
                break;
            case 2:
                
                System.out.println("enter amount to be deposited");
                deposit = sc.nextInt();
                jun.withdraw(deposit);
                break;
            default:
                System.out.println("Invalid Choice");
        }
    System.out.println("Thank you for using our service");
    }
}