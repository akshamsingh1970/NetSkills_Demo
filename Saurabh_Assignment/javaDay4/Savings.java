/*
16- Write a Java programming to create a banking system with three classes - 
Bank Account, SavingsAccount, and CurrentAccount. The bank should have a list of 
accounts and methods for adding them. Accounts should be an interface with methods 
to deposit, withdraw, calculate interest, and view balances. SavingsAccount and 
CurrentAccount should implement the Account interface and have their own unique 
methods.
*/

//* Command Line Program: can be optimized

import java.util.*;
import java.lang.*;

class InvalidDepositException extends Exception{
    InvalidDepositException(String msg){
        super(msg);
    }
}

class InvalidWithdrawException extends Exception{
    InvalidWithdrawException(String msg){
        super(msg);
    }
}

interface BankAccount{
    List<BankAccount> accList = new ArrayList<BankAccount>();
    // static{accList = new ArrayList<BankAccount>();} //!block inializer not allowed

    void deposit(int amt) throws InvalidDepositException;
    void withdraw(int amt) throws InvalidWithdrawException;
    void calcInterest();
    void viewBalance();
    Boolean openAccount();
    void showAccDetails();
}

class SavingsAccount implements BankAccount{
    private int accountNumber;
    private String holder;
    private int balance;
    private static float interestRate;
    String type;


    static{interestRate = 0.04f;}

    public void deposit(int amt) throws InvalidDepositException{
        if(amt < 0){
            throw new InvalidDepositException("be real: amount should be positive.");
        }else{
            balance+=amt;
        }
    }

    public void withdraw(int amt) throws InvalidWithdrawException{
        if(amt < 0 || balance < amt){
            throw new InvalidWithdrawException("Invalid withdraw amount.");
        }else{
            balance-=amt;
        }
    }

    public void calcInterest(){
        float interest = balance*interestRate;

        System.out.println("\n--------------------------\n");
        System.out.println("dear holder,\nInterest is "+interest+" rupees only.");
        System.out.println("\n--------------------------\n");

    }

    public void viewBalance(){
        System.out.println("\n--------------------------\n");
        System.out.println("dear holder,\nYour account balance is "+balance+" rupees only.");
        System.out.println("\n--------------------------\n");
    }

    public Boolean openAccount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Attempt to open Savings account---");
        type = "SBA";

        System.out.print("Enter your name: ");
        holder = sc.next();

        System.out.print("Enter your initial deposit: ");
        int initDeposit = sc.nextInt();  

        if(initDeposit < 1000){
            System.out.println("Minimum deposit is 1000 to open savings acc.");
            return false;
        }else{
            balance = initDeposit;
            accountNumber = BankAccount.accList.size();
            return true;
        }
    }

    public void showAccDetails(){
        System.out.println("\n--------------------------\n");
        System.out.println("Account Information: ");
        System.out.println("Acc Type: "+type+"\nAcc Number: "+accountNumber+"\nHolder: "+holder+"\nBalance: "+balance+"\nInterest Rate: "+interestRate);
        System.out.println("\n--------------------------\n");
    } 
}

class CurrentAccount implements BankAccount{
    private int accountNumber;
    private String holder;
    private int balance;
    private static float interestRate;
    String type;


    static{interestRate = 0.01f;}

    public void deposit(int amt) throws InvalidDepositException{
        if(amt < 0){
            throw new InvalidDepositException("be real: amount should be positive.");
        }else{
            balance+=amt;
        }
    }

    public void withdraw(int amt) throws InvalidWithdrawException{
        if(amt < 0 || balance < amt){
            throw new InvalidWithdrawException("Invalid withdraw amount.");
        }else{
            balance-=amt;
        }
    }

    public void calcInterest(){
        float interest = balance*interestRate;
        System.out.println("\n--------------------------\n");
        System.out.println("dear holder,\nInterest is "+interest+" rupees only.");
        System.out.println("\n--------------------------\n");

    }

    public void viewBalance(){
        System.out.println("\n--------------------------\n");
        System.out.println("dear holder,\nYour account balance is "+balance+" rupees only.");
        System.out.println("\n--------------------------\n");
    
    }

    public Boolean openAccount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Attempt to open Current account---");
        type = "CBA";
        
        System.out.print("Enter your name: ");
        holder = sc.next();

        System.out.print("Enter your initial deposit: ");
        int initDeposit = sc.nextInt();  

        if(initDeposit < 5000){
            System.out.println("Minimum deposit is 5000 to open savings acc.");
            return false;
        }else{
            balance = initDeposit;
            accountNumber = BankAccount.accList.size();
            return true;
        }
    }

    public void showAccDetails(){
        System.out.println("\n--------------------------\n");
        System.out.println("Account Information: ");
        System.out.println("Acc Type: "+type+"\nAcc Number: "+accountNumber+"\nHolder: "+holder+"\nBalance: "+balance+"\nInterest Rate: "+interestRate);
        System.out.println("\n--------------------------\n");
    } 
}

class Main{
    public static void openAccountChoiceHandler(){
        Scanner sc = new Scanner(System.in);

        System.out.println("which type of account do you wanna open?\n(1) Savings\n(2) Current");
        System.out.print(">>> ");
        int ans = sc.nextInt();

        switch(ans){
            case 1:
                Main.openAccountHandler(1);
            break;

            case 2:
                Main.openAccountHandler(2);
            break;
            default:
                System.out.println("wrong choice!!!");
        }
    }

    public static void openAccountHandler(int type){
        Scanner sc = new Scanner(System.in);

        Boolean response;
        BankAccount acc;
        if(type == 1){
            acc = new SavingsAccount();
            response = acc.openAccount();
        }else{
            acc = new CurrentAccount();
            response = acc.openAccount();
        }

        if(response == true){
            BankAccount.accList.add(acc);
            System.out.println("Account open success.");
            acc.showAccDetails();
        }else{
            acc = null;
            System.out.println("Account open failed!!!");
        }
    }

    public static void depositHandler(){
        Scanner sc = new Scanner(System.in);

        System.out.println("deposit request processing...");
        System.out.print("Enter your acc no: ");
        int acc_no = sc.nextInt();

        if(acc_no < 0 || acc_no > BankAccount.accList.size()-1){
            System.out.println("Account not found!!!");
        }else{
            System.out.print("Enter the amount for deposit: ");
            int amt = sc.nextInt();

            try{
                BankAccount.accList.get(acc_no).deposit(amt);
                BankAccount.accList.get(acc_no).viewBalance();
            }catch(InvalidDepositException e){
                System.out.println(e);
            }
        }
    }

    public static void withdrawHandler(){
        Scanner sc = new Scanner(System.in);

        System.out.println("withdrawal request processing...");
        System.out.print("Enter your acc no: ");
        int acc_no = sc.nextInt();

        if(acc_no < 0 || acc_no > BankAccount.accList.size()-1){
            System.out.println("Account not found!!!");
        }else{
            System.out.print("Enter the amount for withdraw: ");
            int amt = sc.nextInt();

            try{
                BankAccount.accList.get(acc_no).withdraw(amt);
                BankAccount.accList.get(acc_no).viewBalance();
            }catch(InvalidWithdrawException e){
                System.out.println(e);
            }
        }
    }

    public static void viewBalanceHandler(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your acc no: ");
        int acc_no = sc.nextInt();
        
        if(acc_no < 0 || acc_no > BankAccount.accList.size()-1){
            System.out.println("Account not found!!!");
        }else{
            BankAccount.accList.get(acc_no).viewBalance();
        }
    }

    public static void calcInterestHandler(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your acc no: ");
        int acc_no = sc.nextInt();
        
        if(acc_no < 0 || acc_no > BankAccount.accList.size()-1){
            System.out.println("Account not found!!!");
        }else{
            BankAccount.accList.get(acc_no).calcInterest();
        }
    }

    public static void showAccDetailsHandler(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your acc no: ");
        int acc_no = sc.nextInt();
        
        if(acc_no < 0 || acc_no > BankAccount.accList.size()-1){
            System.out.println("Account not found!!!");
        }else{
            BankAccount.accList.get(acc_no).showAccDetails();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char key;
        do{
            System.out.println("\n-------------------------------------------");
            System.out.println("🏦 Welcome to apna bank");
            System.out.println("Choose among the following options...");
            System.out.println("(a) open account\n(b) deposit\n(c) withdraw\n(d) view balance\n(e) calculate interest\n(f) show account info\n(q) press 'q' or 'Q' to quit");
            System.out.print(">>> ");
            key = sc.next().charAt(0);
            
            switch(key){
                // int acc_no = -1;     //! why problem arises?
                // int amt = 0;

                case 'a':   Main.openAccountChoiceHandler();
                    break;
                
                case 'b':   Main.depositHandler();
                    break;
                
                case 'c':   Main.withdrawHandler();
                    break;
                
                case 'd':    Main.viewBalanceHandler();
                    break;
                
                case 'e':   Main.calcInterestHandler();
                    break;
                
                case 'f':    Main.showAccDetailsHandler();
                    break;
                
                default:
                    if(key != 'q' && key != 'Q')
                        System.out.println("wrong choice entered!!!");
                    else continue;
            }
        }while(key != 'q' && key != 'Q');


        System.out.println("Exiting....");

        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println(e);
        }

        System.out.println("Thanks for visiting us...");
    }
}