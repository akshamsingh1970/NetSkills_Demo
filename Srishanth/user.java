class Sbibankccount
{   int amount=0;
    public void deposit(int x)
    { amount=amount+x;}
    public void withdraw(int x)
    { amount =amount-x;}
    public void openAccount()
    {  Sbibankccount acc=new Sbibankccount();}
    public void balance()
    {
        System.out.println(amount);
    }

}
class premiumaccount extends Sbibankccount
{
    public void withdraw(int x)
    { if(amount-x <=5000)
       System.out.println("cannot take money");
       else
       amount=amount-x;}
    public void openAccount()
    {Sbibankccount acc =new Sbibankccount();
     this.amount=5000;}
}
class jundhan extends Sbibankccount
{
    public void withdraw(int x)
    {if(amount - x < 0)
      System.out.println("cannot take money"); 
      else
      amount=amount-x;}
}
class user
{
    public static void main(String args[])
    {
        premiumaccount n=new premiumaccount();
        n.openAccount();
        n.balance();
        
        n.deposit(300);
        n.balance();

        n.openAccount();
        n.balance();

        jundhan j=new jundhan();
        j.openAccount();
        j.balance();
        j.deposit(500);
        j.balance();
        j.withdraw(1000);

    }
}