public class SBIBankAccount {

    public int balance = 0;
    public void deposit()
    {

    }
    public  void withdraw()
    {

    }
    public void openAccount()
    {
    }

    public  void checkBalance()
    {
        System.out.println("your current balance is : "+balance);
    }

    public static void main(String args[])
    {


        PremiumAccount Harsh = new PremiumAccount();
        Harsh.openAccount();
        Harsh.withdraw(500);
        Harsh.deposit(1000);
        PremiumAccount Deepak = new PremiumAccount();
        Deepak.openAccount();
        Deepak.withdraw(500);
        Deepak.deposit(1000);
    }
}


