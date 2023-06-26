public class JundhanAccount extends SBIBankAccount{

    @Override
    public void OpenAccount(){
        setBalance(0);
        System.out.println("Thank you for opening Jundhun account.");
        System.out.println("Your initial balance is: "+getBalance());
    }

    @Override
    public void deposit(int addMoney){
        int changeBalance = getBalance()+addMoney;
        setBalance(changeBalance);
        System.out.println("Deposited amount: "+addMoney+" .Jundhun account: Money credited. Balance in Rs: "+getBalance());
    }

    @Override
    public void withdraw(int amount){
        if(amount>=getBalance()){
            System.out.println("Jundhun account: Amount "+ amount+" can't be dispensed. Low Balance");
        }
        else{
            int changeAmount = getBalance()-amount;
            setBalance(changeAmount);
            System.out.println("Amount dispensed: "+amount+".");
            System.out.println("Jundhun account: The balance is: "+getBalance());
        }
    }

}
