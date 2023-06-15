import java.util.*;

public class day2q4 {

    public static void main(String[] args)
    {
        Scanner x=new Scanner(System.in);
        int a,b;
        a=x.nextInt();
        b=x.nextInt();
        int result;
        try{
            result=a/b;
            System.out.println(result);
        }
        catch(InputMismatchException e)
        {
            System.out.println(e.toString());
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.toString());
        }
    }
}
