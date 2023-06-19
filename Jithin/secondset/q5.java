package secondset;

public class q5 {
    public static void main(String[] args) {
        premiumAccount pa=new premiumAccount();
        pa.deposit(1000);
        System.out.println(pa.withdraw(500));
        
    }
}
abstract class SBIBankAccount{
    public abstract boolean withdraw(int x);
    public abstract void deposit(int x);
    public abstract void openAccount();

}
class premiumAccount extends SBIBankAccount{

    int balance=0;

     public boolean withdraw(int x){
        if(balance-x<5000){
            return false;
        }
        balance=balance-x;
        return true;
    }
    public void deposit(int x){
        balance+=x;
    }
    public void openAccount(){
        balance+=5000;
    }
}
class jundhanAcccount extends SBIBankAccount{
    int balance=0;
    public boolean withdraw(int x){
         if(balance-x<0){
            return false;
        }
        balance=balance-x;
        return true;
    }
    public void deposit(int x){
        balance+=x;
    }
    public void openAccount(){
        balance+=0;
    }
} 
