import java.util.ArrayList;
import java.util.List;
public class Bank {
    private ArrayList accounts = new ArrayList<>();
    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println(account+" Added!");
    }
    public void removeAccount(Account account) {
        accounts.remove(account);
        System.out.println(account+" Removed!");
    }
    public void deposit(Account account, double amount) {
        account.deposit(amount);
    }
    public void withdraw(Account account, double amount) {
        account.withdraw(amount);
    }
//    public void showAccounts(){
//        for(ArrayList<> a: accounts){
//            System.out.println("Account: "+a.getClass().getName());
//        }
//    }
}
