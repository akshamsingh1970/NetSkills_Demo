import java.util.Scanner;
public class Factorial {
    public static int factorial(int N){
        if(N==0 ||N==1){
            return 1;
        }
        else{
            return N*factorial(N-1);
        }
    }
    public static void main(String args[]){
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter N");
        N = sc.nextInt();
        System.out.println("factorial of "+N+" is:");
        System.out.println(factorial(N));


    }
}
