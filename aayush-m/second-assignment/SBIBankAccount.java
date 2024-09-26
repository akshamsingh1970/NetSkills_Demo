
public class SBIBankAccount {
    int balance;
    public void openAccount(int amount)   {

    };

    public void withdraw(int amount)  {

    };

    public void deposit(int amount)   {

    };
    
    public static void main(String[] args) {
        PremiumAccount PA = new PremiumAccount();
        PA.openAccount(40);
        PA.openAccount(5000);
        PA.deposit(10000);
        PA.withdraw(7000);
        PA.withdraw(70000);
        PA.openAccount(3000);

        JanDhanAccount JA = new JanDhanAccount();
        JA.openAccount(0);
        JA.openAccount(10000);
        JA.deposit(10000);
        JA.withdraw(7000);
        JA.withdraw(70000);
        JA.openAccount(3000);
    }

}

class PremiumAccount extends SBIBankAccount  {
    boolean flag = true;
    @Override
    public void openAccount(int amount) {
        super.openAccount(amount);
        if(flag)    {
            if(amount < 5000)   {
                System.out.println("Premium account needs minimum amount to be 5000, please try again.");
            }
            else    {
                balance = amount;
                System.out.println("Account created.");
                flag = false;
            }

        }
    }

    @Override
    public void withdraw(int amount) {
        super.withdraw(amount);
        if(balance - amount < 5000)    {
            System.out.println("Not enough balance, balance is: Rs. "+balance);
        }
        else{
            balance -= amount;
            System.out.println("Rs. "+amount+" deducted, balance is: Rs. "+balance);
        }
    }

    @Override
    public void deposit(int amount) {
        super.deposit(amount);
        balance += amount;
        System.out.println("Rs. "+amount+" added. Now balance is: Rs. "+balance);
    }
}

class JanDhanAccount extends SBIBankAccount  {
    int balance;
    boolean flag = true;

    @Override
    public void openAccount(int amount) {
        super.openAccount(amount);
        if(flag)    {
            balance = amount;
            flag = false;
        }
    }

    @Override
    public void withdraw(int amount) {
        super.withdraw(amount);
        if(balance - amount < 0)    {
            System.out.println("Not enough balance, balance is: Rs. "+balance);
        }
        else{
            balance -= amount;
            System.out.println("Rs. "+amount+" deducted, balance is: Rs. "+balance);
        }
    }

    @Override
    public void deposit(int amount) {
        super.deposit(amount);
        balance += amount;
        System.out.println("Rs. "+amount+" added. Now balance is: Rs. "+balance);
    }

}