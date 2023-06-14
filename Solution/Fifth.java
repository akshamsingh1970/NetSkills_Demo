import java.nio.file.AtomicMoveNotSupportedException;

public class Fifth{
    public static void main(String args[]){
        SBIBankAccount obj = new premiumAccount();
        obj.openAccount(46000);

        SBIBankAccount jan = new jundhanAccount();
        jan.openAccount(46000);

        SBIBankAccount dep = new jundhanAccount();
        dep.deposits(46000);

        SBIBankAccount pay = new premiumAccount();
        pay.deposits(46000);

        SBIBankAccount wit = new premiumAccount();
        wit.withdraw(46000);

        SBIBankAccount takeout = new premiumAccount();
        takeout.deposits(46000);
    }

}


class SBIBankAccount {
    int amount;
    public  void deposits(int amount){
        
    }

    public  void withdraw(int amount){
        
    }
    public  void openAccount(int amount){

    }
}

class premiumAccount extends SBIBankAccount{
    

    public  void deposits(int depositAmt){
            if(amount>5000){
                System.out.println("Amount Deposited");
                amount += depositAmt;
            }
            else{
                if(amount + depositAmt>5000){
                    System.out.println("Amount Deposited");
                    amount += depositAmt;
                }
                else{
                    System.out.println("Amount less than 5000 cannot be deposited!");
                }
            }
    }
    
    public  void withdraw(int withdrawAmt){
         if(amount-withdrawAmt<5000){
            System.out.println("Asked withdraw amount less than available Balance");
         }
         else{
            System.out.println("Withdraw Made");
            amount = amount - withdrawAmt; 
         }
    }

    public  void openAccount(int amount){
        if(amount<5000){
            System.out.println("Deposit amount should be more than 5K");
        }
        else{
            System.out.println("Congratulation for joining SBI premium Family!");
            this.amount = amount;
        }
    }
}

class jundhanAccount  extends SBIBankAccount{

    public void deposits(int depositAmt){
        if(depositAmt<0){
            System.out.println("Invalid Amount");
        }
        else{
            System.out.println("Amount Deposited");
            amount += depositAmt;
        }
        
    }

    public  void withdraw(int withdrawAmt){
        if(amount - withdrawAmt<0){
            System.out.println("Available amount less than asked amount");
        }
        System.out.println("Withdraw Made");
        amount = amount - withdrawAmt; 
    }
    public  void openAccount(int amount){
        System.out.println("Congratulation for joining SBI jundhan Family!");
            this.amount = amount;
    }
}