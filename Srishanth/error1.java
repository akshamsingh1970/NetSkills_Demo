import java.util.*;
import java.lang.*;
public class error1
{
    
    public static void main(String args[])
    {
        
        try{int i,j;
    System.out.println("enter a");
    Scanner n=new Scanner(System.in);
    i=n.nextInt();
    System.out.println("enter b");
    Scanner m=new Scanner(System.in);
    j=m.nextInt();
   
      int data=i/j;
      System.out.println(data);
    }
    catch(InputMismatchException e)
    {
        System.out.println(e);
    }
    catch(ArithmeticException  e)
    {
        System.out.println(e);
    }

    System.out.println(" lest rock");
    }

}