// package some;
// check using 
// 2147483648
// 55
import java.util.*;
class Fourth{
    public static void main(String args[]){
        System.out.println("exception handeling program");
        int a, b;
        Scanner sc = new Scanner(System.in);
        
        try{
            a = sc.nextInt();
            b = sc.nextInt();
            int val = a/b;

            System.out.println(val);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(InputMismatchException e){
            System.out.println(e);
        }
    }
}