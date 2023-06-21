package HomeWork3;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
    public Exception(String s) {
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            System.out.println("You entered " + a);
            int b = sc.nextInt();
            System.out.println("You entered " + b);
            sc.close();
            a = a / b;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        }
    }
}
