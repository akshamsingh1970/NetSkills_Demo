/* You have been give two integers a and b as input, you have to compute a/b If a and b are not 32 bit signed integers or if b is zero,
exception will occur and you have to report it.
a : 10 b :3   output a/b
a : 10 b : Hello output java.util.InputMismatchException
a : 10.33 b : 3 output java.util.InputMismatchException 
a : 10 b : 0 output java.lang.AritmeticException
a ) 2147483648 b: 5 java.lang.InputMismatchException
*/
import java.util.Scanner;
import java.util.InputMismatchException;
public class Question4{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int a,b;
        try{
            System.out.print("a : ");
            a = obj.nextInt();
            System.out.print("b : ");
            b = obj.nextInt();
            int c =  a/b;
            System.out.println(c);
        }
        catch(InputMismatchException e){
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Remaining code....");
    }
}