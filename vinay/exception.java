package NetSkills_Demo.vinay;

import java.util.InputMismatchException;

public class exception {
    public static void main(String[] args){

        try{
            int a=Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);
            int ans=a/b;
            System.out.println("ans : "+ ans);
        }
        catch(InputMismatchException e){
            System.out.println(e.getClass().getCanonicalName());
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
