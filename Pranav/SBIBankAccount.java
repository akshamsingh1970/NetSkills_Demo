public class SBIBankAccount {
    public int balance;
    public void openAccount(){
        System.out.println("SBI Account opened");
    }
    public void deposit(int amount){
        this.balance+=amount;
        System.out.println();
        System.out.println(amount+" amount is deposited");
        System.out.println("Current Balance: "+this.balance);
    }
    public void withdraw(int amount){
        System.out.println();
        if(amount<=this.balance) {
            this.balance -= amount;
            System.out.println(amount + " amount is withdrawn");
            System.out.println("Current Balance: "+this.balance);
        }
        else{
            System.out.println("Can't withdraw, Balance is Insufficient");
            System.out.println("Current Balance: "+this.balance);
        }
    }

}