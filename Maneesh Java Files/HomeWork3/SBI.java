package HomeWork3;
import java.util.Random;

class MyException extends Exception {

    public MyException(String s) {
        super(s);

    }
}

class SBI {
    double balance;
    String name;

    public void openAccount() {

        Random random = new Random();
        name = "" + Math.round(random.nextFloat() * Math.pow(10, 12));
        balance = 0;
        System.out.println("Account created");
        System.out.println("Name: " + name);
        System.out.println("Current Balance: " + balance);
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Added " + amount + " to your account");
        System.out.println("Current Balance: " + balance);

    }

    public void withdraw(int amount) {

        if (balance - amount < 0) {
            System.out.println("Insufficient Balance to withdraw");
        }

        else {

            balance -= amount;
            System.out.println("Withdrawn " + amount + " to your account");
            System.out.println("Current Balance: " + balance);
        }

    }
    public static void main(String[] args) {
        Jandhan j = new Jandhan();
        j.openAccount();
        Premium p = new Premium();
        p.openAccount();

        j.deposit(1000);
        p.deposit(100);
        j.withdraw(1000);
        p.withdraw(1000);
    }
}

class Jandhan extends SBI {
    
}

class Premium extends SBI {
    public void openAccount() {

        Random random = new Random();
        this.name = "" + Math.round(random.nextFloat() * Math.pow(10, 12));
        balance = 5000;
        System.out.println("Account created - Premium");
        System.out.println("Name: " + name);
        System.out.println("Current Balance: " + balance);
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Added " + amount + " to your account");
        System.out.println("Current Balance: " + balance);

    }

    public void withdraw(int amount) {

        if (balance - amount < 5000) {
            System.out.println("Insufficient Balance to withdraw");
        }

        else {

            balance -= amount;
            System.out.println("Withdrawn " + amount + " to your account");
            System.out.println("Current Balance: " + balance);
        }

    }
}

