public class SBIBankAccount {
    private int balance;
    public void deposit(int addMoney){
        this.balance+=addMoney;
        System.out.println("Balance in Rs: "+this.balance);
    }

    public void OpenAccount(){
        this.balance = 0;
        System.out.println("Bank account opened with balance: "+this.balance);
    }

    public void withdraw(int amount){
        if(amount>this.balance){
            System.out.println("Insufficient Balance");
        }
        else{
            this.balance-=amount;
            System.out.println("Amount dispensed.");
            System.out.println("The balance is: "+this.balance);
        }
    }

    public void setBalance(int amount){
        this.balance = amount;
    }

    public int getBalance(){
        return this.balance;
    }
}
