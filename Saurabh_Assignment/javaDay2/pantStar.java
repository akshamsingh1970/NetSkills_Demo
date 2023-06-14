// 10->Write a Program to Print the Pant's style Star Pattern.
import java.util.*;
class pantStar{
    public static void main(String args[]){
        // System.out.println(9/2);
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        solve(n);
    }

    public static void solve(int n){
        int x = (n%2==0)?n/2-1:n/2;
        // System.out.println(x);

        for(int i=0; i<n; i++){
            System.out.print("* ");
        }
        System.out.println();
        for(int i=1; i<=x; i++){
            if(n%2==0){
                // print *
                for(int j=0; j<(n-2*i)/2; j++){
                    System.out.print("* ");
                }
                // print " "
                for(int j=0; j<i+i+i; j++){
                    System.out.print(" ");
                }
                // print *
                for(int j=0; j<(n-2*i)/2; j++){
                    System.out.print("* ");
                }

                System.out.println();
            }else{
                // print *
                for(int j=0; j<(n-i-x); j++){
                    System.out.print("* ");
                }
                // print " "
                for(int j=0; j<i+i+i-2; j++){
                    System.out.print(" ");
                }
                // print *
                for(int j=0; j<(n-i-x); j++){
                    System.out.print("* ");
                }

                System.out.println();
            }
        }
    }
}

// 0 1 3 5 7 9
// 0 2 4 6 8 10

// 9 - 1 - 4  
// 9 - 2 - 3
// 9 - 3 - 2
// 9 - 4 - 1

// 11 - 5
// 11 -1 10-5 = 5
// 11- 3 8-5 3