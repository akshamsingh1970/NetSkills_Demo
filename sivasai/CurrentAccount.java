public class CurrentAccount extends Bank implements Account{

    private int OverDraftLimit = 10000;

    public CurrentAccount(double initialBalance){
        this.setBalance(initialBalance);
        this.setAccountType("Current Account");

        System.out.println("Current Account created with initial balance: "+initialBalance);
    }
    public int getOdLimit() {
        return this.OverDraftLimit;
    }

    @Override
    public void deposit(int amount) {
        double changeAmount = getBalance()+amount;
        setBalance(changeAmount);
        System.out.println("Deposited "+amount+" . Current account: Money credited. Balance in Rs: "+this.getBalance());
    }

    @Override
    public void withdraw(int amount) {

        if((double)amount >= getBalance()+getOdLimit()){
            System.out.println("Amount requested: "+amount+" . Amount Crossed OD limit. Amount can't be dispensed");
        }
        else {
            double changeBalance = getBalance()-amount;
            setBalance(changeBalance);
            System.out.println("Amount dispensed: "+amount+".");
            System.out.println("Current account: The balance is: "+getBalance());
        }

    }

    @Override
    public void calculateInterest() {
        double changeBalance = (getBalance()*getRateOfInterest())/100;
        setBalance(changeBalance+getBalance());
    }

    @Override
    public void viewBalance() {
        System.out.println("Your Current Account balance: "+this.getBalance());
    }
}
