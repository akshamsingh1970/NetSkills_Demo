public class jundhanAccount extends SBIBankAccount{
    @Override
    public void openAccount(){
        this.balance=0;
        System.out.println("Jundhan Account opened with balance= "+this.balance);
    }
    @Override
    public void deposit(int amount){
        this.balance+=amount;
        System.out.println();
        System.out.println(amount+" amount is deposited in Jundhan Account");
        System.out.println("Current Balance in Jundhan Account: "+this.balance);
    }
    @Override
    public void withdraw(int amount){
        System.out.println();
        if(amount<=this.balance) {
            this.balance -= amount;
            System.out.println(amount + " amount is withdrawn from the Jundhan Account");
            System.out.println("Current Balance in Jundhan Account: "+this.balance);
        }
        else{
            System.out.println("Can't withdraw, Balance is Insufficient");
            System.out.println("Current Balance in Jundhan Account: "+this.balance);
        }
    }
}