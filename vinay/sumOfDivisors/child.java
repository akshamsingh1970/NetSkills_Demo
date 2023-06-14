package NetSkills_Demo.vinay.sumOfDivisors;

import java.util.Scanner;

public class child implements base {
    @Override
    public int sumOfDivisors (int n){
        int sum=1;
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0) {
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        child obj =new child();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("sum of Divisors is: "+ obj.sumOfDivisors(n));
    }
}
