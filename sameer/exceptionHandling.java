import java.util.InputMismatchException;
import java.util.Scanner;  // Import the Scanner class

public class exceptionHandling {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter 2 numbers:");

        int a, b, ans;
        try {
            a = inputObj.nextInt();
            b = inputObj.nextInt();
            ans = a / b;

            System.out.println(ans);
        }
        catch (InputMismatchException e) {
            System.out.println(e.getClass().getCanonicalName());
       }
       catch(ArithmeticException e){
            System.out.println(e);
       }
    }
}
