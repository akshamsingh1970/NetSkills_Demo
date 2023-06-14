import java.util.Scanner;

public class JundhanAccount extends SBIBankAccount{
    public int balance = 0;
    public boolean account_open = false;
    public void deposit(int am)
    {
        if(!account_open)
        {
            System.out.println("you cannot perform this operation because your account is not activated yet");
            return;
        }
        balance += am;
        System.out.println("after deposit your current balance is : "+balance);
    }
    public  void withdraw(int am)
    {
        if(!account_open)
        {
            System.out.println("you cannot perform this operation because your account is not activated yet");
            return;
        }
        if(balance < am)
        {
            System.out.println("Not enough balance");
            return;
        }
        else balance-=am;
        System.out.println("after withdrawl your current balance is : "+balance);
    }
    public  void checkBalance()
    {
        if(!account_open)
        {
            System.out.println("you cannot perform this operation because your account is not activated yet");
            return;
        }
        System.out.println("your current balance is : "+balance);
    }
    public void openAccount()
    {
        System.out.println("Enter the amount you want to deposit in your account initially : ");
        Scanner s = new Scanner(System.in);
        int am = s.nextInt();
        balance += am;
        account_open = true;
        System.out.println("your account is activated successfully with initial balance : "+ balance);
    }
}
