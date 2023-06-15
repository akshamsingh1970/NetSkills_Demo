import java.util.InputMismatchException;
import java.util.Scanner;

import javax.xml.catalog.Catalog;

public class try_catch1 {
     public static void main(String[] args) { 
        try {
            int a,b;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a and b ");
        a=s.nextInt();
        b=s.nextInt();
        int c=a/b;
        } catch (InputMismatchException e) {
            // TODO: handle exception
            System.out.println(e.getClass());
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
