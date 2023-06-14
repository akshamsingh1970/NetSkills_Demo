public class premiumAccount extends SBIBankAccount{
//    private int balance;
    @Override
    public void openAccount(){
        this.balance=5000;
        System.out.println("Premium Account opened with balance= "+this.balance);
    }
    @Override
    public void deposit(int amount){
        this.balance+=amount;
        System.out.println();
        System.out.println(amount+" amount is deposited in Premium Account");
        System.out.println("Current Balance in Premium Account: "+this.balance);
    }
    @Override
    public void withdraw(int amount){
        System.out.println();
        if(this.balance>=amount+5000) {
            this.balance -= amount;
            System.out.println(amount + " amount is withdrawn from the Premium Account");
            System.out.println("Current Balance in Premium Account: "+this.balance);
        }
        else{
            System.out.println("Can't withdraw, Balance is Insufficient in the Premium Account");
            System.out.println("Current Balance in Premium Account: "+this.balance);
        }
    }
}