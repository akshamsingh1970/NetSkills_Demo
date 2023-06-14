package NetSkills_Demo.vinay.bankingSystem;

public class BankingSystem {
    public static void main(String[] args){
        BankAccount account1=new SavingsAccount();
        BankAccount account2=new CurrentAccount();
        account1.deposit(5000);
        account1.withdraw(2000);


        account2.deposit(5000);
        account2.withdraw(2000);

        account1.viewBalance();
        account2.viewBalance();

        account1.calculateIntrest();
        account2.calculateIntrest();
    }
}
