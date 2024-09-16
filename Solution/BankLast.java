import java.util.*;

 


interface Account
{
    void deposit(double amount);
    void withdrawl(double amount);
    double calculateInterest();
    double viewBalance();
}

 

class SavingsAccount implements Account
{
    double balance;
    double interest;
    SavingsAccount()
    {

    }
    SavingsAccount(double balance,double interest)
    {
        this.balance=balance;
        this.interest=interest;
    }

    public void deposit(double amount)
    {
        balance=balance+amount;
    }
    public void withdrawl(double amount)
    {
        balance=balance-amount;
    }
    public double calculateInterest()
    {
        double intrestamount=(balance*interest)/100;
        balance=balance+intrestamount;
        return balance;
    }
    public double viewBalance()
    {
        return balance;
    }

}

 


class CurrentAccount implements Account
{
    double balance;
    double interest;
    CurrentAccount()
    {

    }
    CurrentAccount(double balance,double interest)
    {
        this.balance=balance;
        this.interest=interest;
    }

    public void deposit(double amount)
    {
        balance=balance+amount;
    }
    public void withdrawl(double amount)
    {
        balance=balance-amount;
    }
    public double calculateInterest()
    {
        double intrestamount=(balance*interest)/100;
        balance=balance+intrestamount;
        return balance;
    }
    public double viewBalance()
    {
        return balance;
    }
}

 

class Bank
{
    ArrayList<String> Accounts_list;
    public Bank()
    {
        Accounts_list=new ArrayList<String>();
    }
    public void Add_Accounts(String account)
    {
        Accounts_list.add(account);
    }
    public void Remove_Accounts(String account)
    {
        Accounts_list.remove(account);
    }
    public void deposit(Account account_obj,double amount)
    {
        account_obj.deposit(amount);
    }
    public void withdrawl(Account account_obj,double amount)
    {
        account_obj.withdrawl(amount);
    }
    public double viewBalance(Account account_obj)
    {
        return account_obj.viewBalance();
    }
    public double calculateInterest(Account account_obj)
    {
        return account_obj.calculateInterest();
    }
}

 


public class BankLast
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Bank bank=new Bank();
        int n=-1;
        int m;
        double initial_amount;
        String account_type;
        double interest_savings=1.2d;
        double interest_current=2.5d;
        SavingsAccount savings=new SavingsAccount();
        CurrentAccount currents=new CurrentAccount();
        do
        {
        System.out.println("Enter the type of account type you want to have (Savings/Current) and initial amount:");
        account_type=sc.next();
        initial_amount=sc.nextDouble();
        if(account_type.equals("SAVING"))
        {
            savings=new SavingsAccount(initial_amount,interest_savings);
        }
        else if(account_type.equals("CURRENT"))
        {
            currents=new CurrentAccount(initial_amount,interest_savings);
        }
        else
        {
            System.out.println("Enter a valid account type.");
            n=1;
        }
        System.out.println("Do you want to open any other account? Enter 1 for Yes and 0 for No.");
        n=sc.nextInt();
        if(n==-1)
        {
            n=sc.nextInt();
        }
        }while(n==1);
        do
        {
            int action;
            System.out.println("To withdrawl-enter 1\nTo deposit-enter 2\nFTo get balance amount details-enter 3\nTo calculate balance after intrest\nTo exit-enter 5");
            action=sc.nextInt();
            String temp_type;
            double temp_amount;
            switch(action)
            {
                case 1:
                    System.out.println("Enter the account type(savings/currents) and amount you would like to withdrawl:");
                    temp_type=sc.next();
                    temp_amount=sc.nextDouble();
                    if(temp_type=="savings")
                    {
                        bank.withdrawl(savings,temp_amount);
                    }
                    else
                    {
                        bank.withdrawl(currents,temp_amount);
                    }
                    break;
                case 2:
                    System.out.println("Enter the account type(savings/currents) and amount you would like to deposit:");
                    temp_type=sc.next();
                    temp_amount=sc.nextDouble();
                    if(temp_type=="savings")
                    {
                        bank.deposit(savings,temp_amount);
                    }
                    else
                    {
                        bank.deposit(currents,temp_amount);
                    }
                    break;
                case 3:
                    System.out.println("Enter the account type(savings/currents):");
                    temp_type=sc.next();
                    if(temp_type=="savings")
                    {
                        System.out.println(savings.viewBalance());
                    }
                    else
                    {
                        System.out.println(currents.viewBalance());
                    }
                    break;
                case 4:
                    System.out.println("Enter the account type(savings/currents):");
                    temp_type=sc.next();
                    temp_amount=sc.nextDouble();
                    if(temp_type=="savings")
                    {
                        System.out.println(bank.calculateInterest(savings));
                    }
                    else
                    {
                        System.out.println(bank.calculateInterest(currents));
                    }

                    break;
                case 5:
                    break;
            }
            System.out.println("Do you want to do any other action? Enter 1 for Yes and 0 for No.");
            m=sc.nextInt();
        }while(m==1);
    }
}