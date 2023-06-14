// 6-> Write a program for factorial 8;
import java.util.*;
class Factorial{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(solve(a));
    }

    public static int solve(int a){
        if(a==1) return 1;

        return a*solve(a-1);
    }
}