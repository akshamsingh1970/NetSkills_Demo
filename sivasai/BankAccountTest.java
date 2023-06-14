public class BankAccountTest {
    public static void main(String []args){
        Bank bank = new Bank();
        SavingsAccount saveAcc = new SavingsAccount(300);
        CurrentAccount currentAcc = new CurrentAccount(300);

        System.out.println("Bank accounts creation");
        bank.AddAccount(saveAcc);
        bank.AddAccount(currentAcc);

        System.out.println();

        System.out.println("Depositing amount: ");
        saveAcc.deposit(100);
        currentAcc.deposit(100);

        System.out.println();

        System.out.println("Amount withdraw: ");
        saveAcc.withdraw(200);
        currentAcc.withdraw(200);

        System.out.println();

        System.out.println("Interest addition:");
        saveAcc.calculateInterest();
        currentAcc.calculateInterest();
        saveAcc.viewBalance();
        currentAcc.viewBalance();

        System.out.println();

        System.out.println("Account withdraw ");
        saveAcc.withdraw(400);
        currentAcc.withdraw(400);


        currentAcc.withdraw(20000);

        System.out.println();

        System.out.println("View Balance: ");
        saveAcc.viewBalance();
        currentAcc.viewBalance();
    }
}
