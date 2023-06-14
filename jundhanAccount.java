public class jundhanAccount extends SBIBankAccount{
    @Override
    public void openAccount(){
        this.balance=0;
        System.out.println("Jundhan Account opened with balance= "+this.balance);
    }
}