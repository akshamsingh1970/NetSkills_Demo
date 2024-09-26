import java.io.*;
import java.util.*;
//import java.util.stream.Collectors;
import java.lang.*;

class InvalidMinimumDepositException  extends Exception  
{  
    public InvalidMinimumDepositException (String str)  
    {  
         
        super(str);  
    }  
}

class InvalidWithdrawException  extends Exception  
{  
    public InvalidWithdrawException (String str)  
    {  
        
        super(str);  
    }  
}  


class SBIBankAccount{
    protected int BalanceAmount;
    public  void deposit(int amount){
System.out.println("Depositing amount");
    }
    public void withdraw(int amount)throws InvalidWithdrawException{
      if(amount <0)throw new InvalidWithdrawException("Negative amount is withdrawn!");
      System.out.println("Withdrawing amount");
    }
    public  void openAccount(int depo)throws InvalidMinimumDepositException{
      if(depo<0)throw new InvalidMinimumDepositException("Negative Deposit!");
     System.out.println("Opening an Account");
    }
}
class PremiumAccount extends SBIBankAccount{
   @Override public void deposit(int amount){
    this.BalanceAmount+=amount;
    System.out.println(amount+" Has been deposited");
    }
    @Override public void withdraw(int amount) throws InvalidWithdrawException{
      if(this.BalanceAmount - amount<5000){
       throw new InvalidWithdrawException("ALERT! Your withdraw Amount is Rejected");
      }else{
       this.BalanceAmount-=amount;
       System.out.println("Amount withdrawn Successfully! "+this.BalanceAmount +" is left in the Account");
      }
    }
    @Override public  void openAccount(int depo)throws InvalidMinimumDepositException{
        this.BalanceAmount=0;
     if(depo<5000){
     throw new InvalidMinimumDepositException("ALERT! Minumum deposit must be 5K For opening Premium account");
     }else{
        this.BalanceAmount+=depo;
        System.out.println("Premium Account has been created: ");
     }
    }
}

class JundhanAccount extends SBIBankAccount{
@Override public  void deposit(int amount){
    this.BalanceAmount+=amount;
    System.out.println(amount+" Has been deposited");
    }
    @Override public  void withdraw(int amount)throws InvalidWithdrawException{
  if(this.BalanceAmount - amount<0){
       throw new InvalidWithdrawException("ALERT! Your withdraw Amount is Rejected");
      }else{
       this.BalanceAmount-=amount;
       System.out.println("Amount withdrawn Successfully! "+this.BalanceAmount +" is left in the Account");
      }
    }
    @Override public  void openAccount(int depo)throws InvalidMinimumDepositException{
      this.BalanceAmount=0;
     if(depo<0){
     throw new InvalidMinimumDepositException("ALERT! Minumum deposit must be 0 For opening Jundhan account");
     }else{
        this.BalanceAmount+=depo;
        System.out.println("Jundhan Account has been created: ");
     }
    }
    }

class SbiAccount{
    public static void main(String[] args){
  char account;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter P for Opening Premium account or else Enter J: ");
  account=sc.next().charAt(0);
  if(account=='P'){
    try{
  SBIBankAccount acc1=new PremiumAccount();
  int depo;
  System.out.println("Enter deposit for opening Account: ");
  depo=sc.nextInt();
  acc1.openAccount(depo);
  char D,D1;
  System.out.println("Enter Y if you want to deposit or else N: ");
  D=sc.next().charAt(0);
  if(D=='Y'){
    int amt;
    System.out.println("How much amount you need to deposit: ");
    amt=sc.nextInt();
    acc1.deposit(amt);
  }
   System.out.println("Enter Y if you want to Withdraw Amount or else N: ");
  D1=sc.next().charAt(0);
  if(D1=='Y'){
    int amt;
    System.out.println("How much amount you need to withdraw: ");
    amt=sc.nextInt();
    acc1.withdraw(amt);
  }
  }catch(InvalidMinimumDepositException e){
    System.out.println(e);
  }
  catch(InvalidWithdrawException e){
    System.out.println(e);
  }
  }else{
    try{
    int depo;
   SBIBankAccount acc1=new JundhanAccount();
   System.out.println("Enter deposit for opening Account: ");
  depo=sc.nextInt();
  acc1.openAccount(depo);
  char D,D1;
  System.out.println("Enter Y if you want to deposit or else N: ");
  D=sc.next().charAt(0);
  if(D=='Y'){
    int amt;
    System.out.println("How much amount you need to deposit: ");
    amt=sc.nextInt();
    acc1.deposit(amt);
  }
   System.out.println("Enter Y if you want to Withdraw Amount or else N: ");
  D1=sc.next().charAt(0);
  if(D1=='Y'){
    int amt;
    System.out.println("How much amount you need to withdraw: ");
    amt=sc.nextInt();
    acc1.withdraw(amt);
  }
  }catch(InvalidMinimumDepositException e){
    System.out.println(e);
  }
  catch(InvalidWithdrawException e){
    System.out.println(e);
  }
  }
  

  }
}