import java.util.InputMismatchException;
import java.util.Scanner;
public class exceptionCase {
    public static void main(String args[]){
        int a,b;
    try (Scanner x = new Scanner(System.in)) {
        int res;
        try{
            System.out .println("Enter a and b: ");
            a=x.nextInt();
            b=x.nextInt();
            res=a/b;
            System.out.println("Division process has been done successfully.");  
            System.out.println("Result came after division is: " + res);  
        }  
// handling the exception in the catch block  
        catch(ArithmeticException e){  
            System.out.println(e);  
        } 
        catch(InputMismatchException e) {
            // System.out.println("input mismatch");
            System.out.println(e);
        }
    }
    }
}
