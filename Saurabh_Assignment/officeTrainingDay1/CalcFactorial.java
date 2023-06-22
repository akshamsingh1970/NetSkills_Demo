
import java.util.*;

@FunctionalInterface
interface MyInterface{
    void solve();
}

class InvalidInputException extends Exception{
    public InvalidInputException(String msg){
        super(msg);
    }
}

class Main{
    int fact(int n) throws InvalidInputException{
        if(n<0) throw new InvalidInputException("Negative input recieved for factorial.");
        if(n==0 || n==1) return n;
        return n*fact(n-1);
    }
    public static void main(String args[]){
        MyInterface mi = ()->{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter n: ");
            int n = sc.nextInt();

            try{
                Main obj = new Main();
                int ans = obj.fact(n); // have to use warna can't access non-static from static context
                System.out.println("Factorial of "+n+" is "+ans);
            }catch(InvalidInputException e){
                System.out.println(e);
            }

        };

        mi.solve();
    }
}