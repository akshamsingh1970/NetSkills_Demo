package JavaClassQuestion;


import java.util.*;

public class twoInt {
    public static void main(String args[]){
        try{
            int a, b;
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            b = sc.nextInt();

            int val = a/b;
            System.out.println(val);
            sc.close();
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(InputMismatchException e){
            System.out.println(e);
        }
        
    }
}
