import java.util.*;
interface Sum_of_divisors {
    static int Sumofdivisors(int n){
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            sum+=i;
        }
        return sum;
    };
}

public class Interface1 implements Sum_of_divisors {
    public static void main(String[] arg){
        Interface1 A = new Interface1();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value of n ");
        int n=s.nextInt();
        System.out.println("Sum of divisors of "+n+" is "+Sum_of_divisors.Sumofdivisors(n));
    }
}
