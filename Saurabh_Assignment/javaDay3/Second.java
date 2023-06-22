import java.util.*;
import java.lang.*;

interface MyInterface{
    int fun(int a);
}

class DivisorSum implements MyInterface{
    public int fun(int a){
        int sum = 0;
        for(int i=1; i<=Math.sqrt(a); i++){
            if(a%i == 0){
                sum += (i + (a/i));
            }
        }
        return sum;
    }
}

class Second{
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        DivisorSum obj = new DivisorSum();

        System.out.println("Sum of divisors of "+n+": "+obj.fun(n));
    }
}