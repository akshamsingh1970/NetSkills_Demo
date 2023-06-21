package HomeWork3;
import java.util.Scanner;

interface Example2 {
    int method1(int num);
}

class Example3 implements Example2 {
    public int method1(int num) {
        int sumOfFactors = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                sumOfFactors += (i) + ((i * i != num) ? (num / i) : 0);
            }    
        }
        return sumOfFactors;
    }
}

class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        Example3 eg = new Example3();
        System.out.println("Sum of factors of "+num+" is "+eg.method1(num));
        sc.close();
    }
}
