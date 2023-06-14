package NetSkills_Demo.vinay.SbiBank;

public class PremiumAccount extends SbiBankAccount {


    private int balance;
    public void PremiumAccount(){
        balance=0;
    }
   @Override
    public void deposit(int depositAmount){
       this.balance+=depositAmount;
       System.out.println("Deposit Successfully completed");
       System.out.println("Now your current balance is: "+this.balance);
    }

    @Override
    public void withdraw(int withdrawAmount){
      if(this.balance<(5000+withdrawAmount)){
          System.out.println("We cannot process your withdraw request because of Insufficient Balance");
      }
      else{
          this.balance-=withdrawAmount;
          System.out.println("Withdraw Successfully completed");
          System.out.println("Now your current balance is: "+this.balance);
      }
    }
    @Override
    public void openAccount(){
         this.balance=5000;
        System.out.println("Your Jundhan Account is Successfully created");
        System.out.println("Your Current Balance is : "+this.balance);
    }
    public static void main(String[] args){

        PremiumAccount account=new PremiumAccount();
        account.deposit(10000);
        account.withdraw(5000);
    }
}
