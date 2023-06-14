import java.util.InputMismatchException;
import java.util.Scanner;

public class HandlingExceptions {
    public static void main(String[] args){
        try{
            System.out.println("Enter a, b: ");
            Scanner scan = new Scanner(System.in);
            arithExc(scan);

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public static void arithExc(Scanner scan) throws ArithmeticException{
        try{
            int a=scan.nextInt();
            int b=scan.nextInt();
            int z= a/b;
            System.out.println("a/b= "+ z);
        }
        catch (ArithmeticException e){
            throw e;
        }
    }
}