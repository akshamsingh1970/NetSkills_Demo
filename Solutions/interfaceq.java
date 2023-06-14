import java.io.*;
import java.util.*;

interface in1 {
    int factors(int num);
}

class interfaceq implements in1 {

    // public int a;

    // public interfaceq (int num) {
    //     this.a = num;
    // }

    public int factors(int a) {
        int sum = a;
        for (int i=1;i<=(a/2);i++) {
            if (a%i==0) {
                sum+=i;
            }
        }
        // System.out.println("Sum of divisors : "+sum);
        return sum;
    }

    public static void main (String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = s.nextInt();
        interfaceq obj = new interfaceq ();
        System.out.println("Sum of factors are : "+obj.factors(n));
    }
}