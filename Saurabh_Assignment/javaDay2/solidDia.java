// 9-> Write a program to Print a solid Diamond Star Pattern.
import java.util.*;

class SolidDia{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        solve(n);
    }

    public static void solve(int n){
        for(int i=0; i<n; i++){
            // print spaces
            for(int j=n-i-1; j>=0; j--){
                System.out.print(" ");
            }
            // print *'s
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
        // downside
        for(int i=n-2; i>=0; i--){
            // print spaces
            for(int j=0; j<=n-i-1; j++){
                System.out.print(" ");
            }
            // print *'s
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}