import java.util.*;

 

abstract class SBIBankAccount

{

   double balance=0.0d;

   public abstract void deposit(double amount);

   public abstract void withdrawl(double amount);

   public abstract void openAccount();

}

 

class premiumAccount extends SBIBankAccount

{

   premiumAccount()

   {

      

   }

   public void openAccount()

   {

       balance=balance+5000;

   }

   public void withdrawl(double amount)

   {

       balance=balance-amount;

       if(balance<5000)

       {

           balance=balance+amount;

           System.out.println("Your Premium Accounts does not have Rs 5000 after this withdrawl. Try a smaller amount.");

       }

       else

       {

           System.out.println("Amount "+ amount + "has been debited from your Premium Account.");

       }

   }

   public void deposit(double amount)

   {

       balance=balance+amount;

   }

  

  

}

 

class jundhanAccount extends SBIBankAccount

{

   jundhanAccount()

   {

      

   }

   public void openAccount()

   {

       balance=balance+0;

   }

   public void withdrawl(double amount)

   {

       balance=balance-amount;

       if(balance<0)

       {

           balance=balance+amount;

           System.out.println("Your Jundhan Accounts does not have this amount. Try a smaller amount.");

       }

       else

       {

           System.out.println("Amount "+ amount + "has been debited from your Jundhan Account.");

       }

   }

   public void deposit(double amount)

   {

       balance=balance+amount;

   }

}

 

 

public class bank1

{

           public static void main(String[] args) {

                       Scanner sc=new Scanner(System.in);

                       String account_type;

                       int n=-1;

                       int m=0;

                       premiumAccount PA=new premiumAccount();

                       jundhanAccount JA=new jundhanAccount();

                       do

                       {

                           System.out.println("Which type of account would you like to have? (Jundhan/Premium):");

                           account_type=sc.next();

                           account_type=account_type.toUpperCase();

                           if(account_type=="JUNDHAN")

                           {

                               JA.openAccount();

                           }

                           else if(account_type=="PREMIUM")

                           {

                               PA.openAccount();

                           }

                           System.out.println("Do you want to open another account? Enter 1 for yes or 0 for no.");

                           n=sc.nextInt();

                       }while(n==1);

                       do

       {

           int action;

           System.out.println("To withdrawl from Jhandhan-enter 1\nTo deposit in Jhandhan-enter 2\nTo withdrawl from Premium-enter 3\nTo deposit to Premium-enter 4\nTo exit-enter 5");

           action=sc.nextInt();

           String temp_type;

           double temp_amount;

           switch(action)

           {

               case 1:

                  System.out.println("Enter the amount you would like to withdrawl:");

                  temp_amount=sc.nextDouble();

                   JA.withdrawl(temp_amount);

                   break;

               case 2:

                  System.out.println("Enter the amount you would like to deposit:");

                  temp_amount=sc.nextDouble();

                   JA.deposit(temp_amount);

                   break;

               case 3:

                  System.out.println("Enter the amount you would like to withdrawl:");

                  temp_amount=sc.nextDouble();

                   PA.withdrawl(temp_amount);

                   break;

               case 4:

                  System.out.println("Enter the amount you would like to deposit:");

                  temp_amount=sc.nextDouble();

                   PA.deposit(temp_amount);

                   break;

               case 5:

                   break;

           }

           System.out.println("Do you want to do any other action? Enter 1 for Yes and 0 for No.");

           m=sc.nextInt();

       }while(m==1);

           }

}