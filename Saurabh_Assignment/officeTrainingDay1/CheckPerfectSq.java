import java.util.*;
import java.lang.*;

@FunctionalInterface
interface MyInterface{
    void solve() throws NegativeInputException;
}

class NegativeInputException extends Exception{
    NegativeInputException(String msg){
        super(msg);
    }
}

class Main{
    public static void main(String args[]){
        MyInterface mi = ()->{
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter n: ");
            int n = sc.nextInt();

            if(n<0) throw new NegativeInputException("Negative input received!!!");

            int temp = (int)(Math.floor(Math.sqrt(n)));
            if(temp*temp == n){
                System.out.println("Perfect Square");
            }else{
                System.out.println("Not Perfect Square");
            }
        };
        
        try{
            mi.solve();
        }catch(NegativeInputException e){
            System.out.println(e);
        }
    }
}