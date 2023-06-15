package secondset;

import java.util.HashMap;

public class q6 {
    public static void main(String[] args) {

        savingsAccount first=new savingsAccount("20488403244");
        System.out.println(first.deposit(first.getAccountNumber(),10000));  
        System.out.println(first.withdraw(first.getAccountNumber(), 50000));

    }
}

class bank{

    HashMap< String, Integer> accounts = new HashMap<String, Integer>();
    String accNumber;

    public bank(String accountNumber){
        accounts.put(accountNumber,0);
        accNumber=new String(accountNumber);
    }
    public String getAccountNumber(){
        return accNumber;
    }

}
interface accounts{

    public int deposit(String accountNumber,int x);
    public boolean withdraw(String accountNumber,int x);
    public int viewBalance(String accountNumber);


}
class savingsAccount extends bank implements accounts{

    public savingsAccount(String accountNumber){
        super(accountNumber);
    }


     public int deposit(String accountNumber,int x){

        int val=accounts.get(accountNumber);
        val+=x;
        accounts.put(accountNumber,val);
        return val;
    }

    public boolean withdraw(String accountNumber,int x){

        int val=accounts.get(accountNumber);
        
        if(val<x){
            return false;
        }
        val-=x;
        accounts.put(accountNumber,val);
        return true;
    }
    public int viewBalance(String accountNumber){
        return accounts.get(accountNumber);
    }

}
class currentAccount extends bank implements accounts{

     public currentAccount(String accountNumber){
        super(accountNumber);
    }

    public int deposit(String accountNumber,int x){

        int val=accounts.get(accountNumber);
        val+=x;
        accounts.put(accountNumber,val);
        return val;
    }

    public boolean withdraw(String accountNumber,int x){

        int val=accounts.get(accountNumber);
        if(val<x){
            return false;
        }
        val-=x;
        accounts.put(accountNumber,val);
        return true;
    }
     public int viewBalance(String accountNumber){
        return accounts.get(accountNumber);
    }

}
