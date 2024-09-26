public class sbiAccount {
    int balance;

    public void deposit(int amount) {
    }

    public void withdraw(int amount) {
    }

    public void openAccount(int amt) {

    }

    public static void main(String[] args) {
        sbiAccount p = new premiumAccount();
        p.openAccount(5000);
        p.deposit(1000);
        p.withdraw(0);

        sbiAccount j = new junDhanAccount();
        j.openAccount(2000);
        j.deposit(500);
        j.withdraw(3000);

    }

}

class premiumAccount extends sbiAccount {

    @Override
    public void openAccount(int amt) {
        super.openAccount(amt);
        balance=amt;
        System.out.println("premium account opened and balance is : "+amt);

    }

    @Override
    public void deposit(int amount) {
        super.deposit(amount);
        balance+=amount;
        System.out.println("credited and current balance of premium is : " + balance);
    }

    @Override
    public void withdraw(int amount) {
        if (balance - amount < 5000) {
            System.out.println("not possible and current balance is"+balance);
            System.out.println();
        } else {
            balance-=amount;
            System.out.print("debited and current balance of premium is : " + balance);
            System.out.println();
        }
    }
}

class junDhanAccount extends sbiAccount {

    @Override
    public void openAccount(int amt) {
        super.openAccount(amt);
        balance=amt;
        System.out.println("jundhan account opened and balance is : "+amt);

    }

    @Override
    public void deposit(int amount) {
        super.deposit(amount);
        balance+=amount;
        System.out.println("credited and current balance of jandhan is : " + balance);

    }

    @Override
    public void withdraw(int amount) {
        super.withdraw(amount);
        if(balance-amount<0){
            System.out.print("not possible and current balance is : " + balance);
        }
        else{
            balance-=amount;
            System.out.print("debited and current balance of jandhan is : " + balance);
        }
    }
}