public class SBITest {

    public static void main(String []args){
        PremiumBankAccount prAcc = new PremiumBankAccount();
        JundhanAccount jdAcc = new JundhanAccount();

        System.out.println();

        System.out.println("Opening accounts testing");
        prAcc.OpenAccount();
        jdAcc.OpenAccount();

        System.out.println();

        System.out.println("Deposit testing");
        prAcc.deposit(300);
        jdAcc.deposit(500);

        System.out.println();

        System.out.println("Withdraw testing");
        prAcc.withdraw(200);
        jdAcc.withdraw(300);

        System.out.println();

        System.out.println("Account limit testing");
        prAcc.withdraw(400);
        jdAcc.withdraw(400);

    }
}
