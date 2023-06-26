import java.util.ArrayList;

public class Bank {
    private double balance;
    private String AccountType;

    private ArrayList accounts;

    private final double rateOfInterest = 4.20;

    public Bank(){
        accounts = new ArrayList<>();
    }

    public void AddAccount(Account account){
        accounts.add(account);
    }

    public void removeAccount(Account account){
        accounts.remove(account);
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public String getAccountType() {
        return this.AccountType;
    }

    public void setAccountType(String accountType) {
        this.AccountType = accountType;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setBalance(double amount){
        this.balance = amount;
    }


}
