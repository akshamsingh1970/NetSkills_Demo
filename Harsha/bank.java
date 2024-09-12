public class bank {
    public static void main(String[] args){
        premiumAccount pa = new premiumAccount();
        pa.openAccount();
        pa.deposit(1000);
        pa.withdraw(500);
        pa.withdraw(1000);

        jundhanAccount ja = new jundhanAccount();
        ja.openAccount();
        ja.deposit(1000);
        ja.withdraw(500);
        ja.withdraw(1000);
    }
}

class SBIBankAccount{
    public int balance;

    void openAccount(){}

    int withdraw(int n){return 0;}
    void deposit(int n){
        balance += n;
        System.out.println("Deposit Sucess: "+n+ "\n Remaining Balance: " + balance);
    }

}

class premiumAccount extends SBIBankAccount{
    @Override
    void openAccount(){
        balance = 5000;
        System.out.println("\n\nPreminum Account \n\nAccount opening sucess" + "\n Remaining Balance: " + balance);
    }

    @Override
    int withdraw(int n){
        if((balance - n )< 5000 ){
            System.out.println("Insufficient Balance"+ "\n Remaining Balance: " + balance);
            return 0;
        }
        else{
            balance -= n;
            System.out.println("Withdrawl sucess: " + n + "\n Remaining Balance: " + balance);
            return 1;
        }
    }
}

class jundhanAccount extends SBIBankAccount{
    @Override
    void openAccount(){
        balance = 0;
        System.out.println("\n" + //
                "\n" + //
                "jundhan Account \n" + //
                "\n" + //
                "Account opening sucess" + "\n Remaining Balance: " + balance);
    }

    @Override
    int withdraw(int n){
        if((balance - n )< 0){
            System.out.println("Insufficient Balance"+ "\n Remaining Balance: " + balance);
            return 0;
        }
        else{
            balance -= n;
            System.out.println("Withdrawl sucess: " + n+ "\n Remaining Balance: " + balance);
            return 1;
        }
    }
}