import java.util.*;

class ExceptionHandle{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        try{
            int a,b;
            System.out.println("enter two numbers");
            a = sc.nextInt();
            b = sc.nextInt();
        
        
        
            float c;
            c = a/b;
            System.out.println("result of"+a+"/"+b+" is"+c);
        }
        catch(InputMismatchException e){
            System.out.println(e);
        }
        catch(ArithmeticException e){
                System.out.println(e);
        }
        finally{
            System.out.println("Try to correct your code");
        }
    }

}