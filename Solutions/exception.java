import java.util.*;

public class exception {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=0,b=0;
        System.out.println("Enter two numbers ");
        
        boolean err = false;
        try{
            // int [] arr = {1,2};
            // int val = arr[4];
            a=s.nextInt();
            b=s.nextInt();
        }
        catch(InputMismatchException e) {
            System.out.println("Caught input mismatch exception "+e);
            err = true;
        }
        if (!err) {
            try {
                int ans=a/b;
            }
            catch(ArithmeticException e) {
                System.out.println("Caught arithmetic exception");
            }
            // catch(Exception e) {
            //     System.out.println(e);
            //     err = true;
            // }
            finally {
                if (!err)
                System.out.println("Division successful : " + a/b);
            }
        }
        
    }
}