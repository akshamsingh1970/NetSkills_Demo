package Java;

// *inverrted pant*

// 11-> Write a Program to Print the Inverted Pant's Shape Star Pattern.




import java.util.*;

class invPants{

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




        for(int i=x; i>=1; i--){

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




        for(int i=0; i<n; i++){

            System.out.print("* ");

        }

    }

}
