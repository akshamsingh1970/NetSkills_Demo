public class TestAccounts {
    public static void main(String[] args){
        Bank banks = new Bank();
        CurrentAccount currentAc=new CurrentAccount();
        SavingsAccount savingsAc= new SavingsAccount();
        banks.addAccount(currentAc);
        banks.addAccount(savingsAc);
        System.out.println();
        currentAc.deposit(1000);
        System.out.println("Balance: "+currentAc.viewBalance());
        currentAc.withdraw(200);
        currentAc.withdraw(10700);
        currentAc.withdraw(200);
        System.out.println("ODLimit: "+currentAc.viewODLimit());
        System.out.println();
        savingsAc.deposit(1000);
        System.out.println("Interest: "+savingsAc.viewInterest());
        savingsAc.withdraw(100);
        savingsAc.withdraw(1000);
        System.out.println("Balance: "+currentAc.viewBalance());
    }
}