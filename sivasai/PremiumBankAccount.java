public class PremiumBankAccount extends SBIBankAccount{

    @Override
    public void OpenAccount(){
        setBalance(5000);
        System.out.println("Thank you for opening premium account.");
        System.out.println("Your initial balance is: "+getBalance());
    }

    @Override
    public void deposit(int addMoney){
        int changeBalance = getBalance()+addMoney;
        setBalance(changeBalance);
        System.out.println("Deposited "+addMoney+" .Premium account: Money credited. Balance in Rs: "+getBalance());
    }

    @Override
    public void withdraw(int amount){
        if(amount>=getBalance()-5000){
            System.out.println("Amount requested: "+amount+" .Premium account: Balance will be below 5000. Amount can't be dispensed");
        }
        else{
            int changeAmount = getBalance()-amount;
            setBalance(changeAmount);
            System.out.println("Amount dispensed: "+amount+".");
            System.out.println("Premium account: The balance is: "+getBalance());
        }
    }

}
