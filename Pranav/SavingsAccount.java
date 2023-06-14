class SavingsAccount implements Account {
    private double balance=0;
    private double interestRate = 7/100;
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Available Balance in Savings Account: "+viewBalance());
    }

    @Override
    public void withdraw(double amount) {
        if(balance>=amount){
            balance -= amount;
            System.out.println("The amount "+amount+" is Withdrawn from the Savings Account");
            System.out.println("Available Balance in Savings Account: "+viewBalance());
        }
        else {
            System.out.println("Insufficient Funds");
            System.out.println("Available Balance in Savings Account: "+viewBalance());
        }
    }

    @Override
    public double viewBalance() {
        return balance;
    }
    public double viewInterest() {
        return interestRate;
    }
}
