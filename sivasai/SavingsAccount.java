public class SavingsAccount extends Bank implements Account{

    public SavingsAccount(double initialDeposit){
        this.setBalance(initialDeposit);
        this.setAccountType("Savings Account");

        System.out.println("Savings Account created with initial balance: "+initialDeposit);
    }
    @Override
    public void deposit(int amount) {
        double changeAmount = getBalance()+amount;
        setBalance(changeAmount);
        System.out.println("Deposited "+amount+" . Savings account: Money credited. Balance in Rs: "+this.getBalance());
    }

    @Override
    public void withdraw(int amount) {

        if((double)amount >= getBalance()){
            System.out.println("Amount requested: "+amount+" . Low balance. Amount can't be dispensed");
        }
        else {
            double changeBalance = getBalance()-amount;
            setBalance(changeBalance);
            System.out.println("Amount dispensed: "+amount+".");
            System.out.println("Savings account: The balance is: "+getBalance());
        }

    }

    @Override
    public void calculateInterest() {
        double changeBalance = (getBalance()*getRateOfInterest())/100;
        setBalance(changeBalance+getBalance());
    }

    @Override
    public void viewBalance() {
        System.out.println("Your Savings Account balance: "+this.getBalance());
    }
}
