/* 2-> Create an Interface that contains a method, where the mehtod return type is int and the method has one 
int tyep parameter. You need to write another class that implements the interface. And your function just takes 
an integer as input and return the sum of all its diviors. For example divisors of 8 are 1,2,4 and 8, so divisor
addtion should return 15. The value of n be at most 1000. */
import java.util.Scanner;
interface SumOfDivisors{
    int SumOfDivisors(int n);
}
public class Question2 implements SumOfDivisors{
    public int SumOfDivisors(int n){
        int sum = 0;
        for(int i = 1; i*i <= n; i++){
            if(i*i == n)    sum += i;
            else    sum += (i+n/i);
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        q2 obj1 = new q2();
        System.out.print("Enter a value between 0 and 1000 : ");
        int a = obj1.SumOfDivisors(obj.nextInt());
        System.out.println("Sum of Divisors : " + a);
    }
}