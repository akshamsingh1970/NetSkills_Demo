// SBIBankAccount class
class SBIBankAccount {
    protected double balance;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount " + amount + " deposited successfully.");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount " + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }

    public void openAccount() {
        System.out.println("Account opened successfully.");
    }
}

// PremiumAccount subclass
class PremiumAccount extends SBIBankAccount {
    @Override
    public void deposit(double amount) {
        if (amount >= 5000) {
            balance += amount;
            System.out.println("Amount " + amount + " deposited successfully to Premium Account.");
        } else {
            System.out.println("Minimum deposit amount for Premium Account is 5000.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 5000) {
            balance -= amount;
            System.out.println("Amount " + amount + " withdrawn successfully from Premium Account.");
        } else {
            System.out.println("Withdrawal failed. Minimum balance of 5000 required for Premium Account.");
        }
    }

    @Override
    public void openAccount() {
        balance = 5000;
        System.out.println("Premium Account opened successfully with initial balance of 5000.");
    }
}

// JundhanAccount subclass
class JundhanAccount extends SBIBankAccount {
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount " + amount + " deposited successfully to Jundhan Account.");
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 0) {
            balance -= amount;
            System.out.println("Amount " + amount + " withdrawn successfully from Jundhan Account.");
        } else {
            System.out.println("Withdrawal failed. Insufficient balance in Jundhan Account.");
        }
    }

    @Override
    public void openAccount() {
        balance = 0;
        System.out.println("Jundhan Account opened successfully with initial balance of 0.");
    }
}

// Main class to test the bank accounts
class bank {
    public static void main(String[] args) {
        // Testing PremiumAccount
        PremiumAccount premiumAccount = new PremiumAccount();
        premiumAccount.openAccount();
        premiumAccount.deposit(6000);
        premiumAccount.withdraw(3000);
        premiumAccount.withdraw(4000);
        System.out.println("Premium Account balance: " + premiumAccount.balance);

        System.out.println();

        // Testing JundhanAccount
        JundhanAccount jundhanAccount = new JundhanAccount();
        jundhanAccount.openAccount();
        jundhanAccount.deposit(2000);
        jundhanAccount.withdraw(1500);
        jundhanAccount.withdraw(1000);
        System.out.println("Jundhan Account balance: " + jundhanAccount.balance);
    }
}





