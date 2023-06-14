import java.util.Scanner;

public class handling {
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
            int a = in.nextInt();
 
            int b = in.nextInt();
            int c = a/b;
            System.out.println(a+"/"+b+" = "+c);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e.getClass().getName());
        }
    }
}
