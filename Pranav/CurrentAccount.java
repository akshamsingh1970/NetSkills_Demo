class CurrentAccount implements Account {
    private double balance=0;
    private double ODLimit=10000;
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Available Balance in Current Account: "+viewBalance());
    }
    @Override
    public void withdraw(double amount) {
        if (balance + ODLimit >= amount) {
            balance -= amount;
            System.out.println("The amount "+amount+" is Withdrawn from the Current Account");
            System.out.println("Available Balance in Current Account: "+viewBalance());
        }
        else {
            System.out.println("Insufficient Funds");
            System.out.println("Available Balance in Current Account: "+viewBalance());
        }
    }
    @Override
    public double viewBalance() {
        return balance;
    }

    @Override
    public double viewInterest() {
        return 0;
    }
    public double viewODLimit(){
        return ODLimit;
    }
}
