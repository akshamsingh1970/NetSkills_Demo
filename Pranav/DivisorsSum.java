import java.util.Scanner;

public class DivisorsSum implements InterfaceTraining{
    public static void main(String[] args){
        System.out.println("Enter the Number: ");
        Scanner scan = new Scanner(System.in);
        int a= scan.nextInt();
        System.out.println("Sum of Divisors of "+a+"= "+sumofDivisors(a));
    }
//    @Override
    public static int sumofDivisors(int a) {
        int sum=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                sum+=i;
            }
        }
        return sum;
    }
}