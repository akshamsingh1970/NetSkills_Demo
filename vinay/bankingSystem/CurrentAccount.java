package NetSkills_Demo.vinay.bankingSystem;

public class CurrentAccount implements BankAccount {

    private int balance;

    public void CurrentAccount(){
        this.balance=0;
    }
    @Override
    public void deposit(int depositAmount){
        this.balance+=depositAmount;
        System.out.println("Deposit Successfully completed");
        System.out.println("Now your current balance is: "+this.balance);
    }
    @Override
    public void withdraw(int withdrawAmount){
        if(this.balance<withdrawAmount){
            System.out.println("We cannot process your withdraw request because of Insufficient Balance");
        }
        else{
            this.balance-=withdrawAmount;
            System.out.println("Withdraw Successfully completed");
            System.out.println("Now your current balance is: "+this.balance);
        }
    }
    @Override
    public void calculateIntrest(){
        double Intrest=this.balance*0.05;
        System.out.println("Intrest is : "+Intrest);
    }
    @Override
    public void viewBalance(){
        System.out.println("Now your current balance is: "+this.balance);
    }
    public static void main(String[] args){
        
    }
}
