import java.util.Scanner;

public class exception {

    public static void main(String[] args) {



        try {
            Scanner myObj = new Scanner(System.in);
            System.out.print("Enter the numerator: ");
            int a = myObj.nextInt();
            System.out.print("Enter the denominator: ");
            int b = myObj.nextInt();

            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
