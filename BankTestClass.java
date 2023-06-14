public class BankTestClass {
    public static void main(String[] args){
        jundhanAccount jA=new jundhanAccount();
        premiumAccount pA=new premiumAccount();
        jA.openAccount();
        pA.openAccount();
        jA.deposit(300);
        jA.withdraw(20);
        jA.withdraw(2222);
        System.out.println();
        pA.deposit(20);
        pA.withdraw(20);
        pA.withdraw(30);
    }
}