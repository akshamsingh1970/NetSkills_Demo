import java.util.*;
public class p10{
    public static void main(String[] args)
    {
        int n = 5;
         
        // Outer loop for the line/row change
        for(int i=n; i>=1; i--) {
             
            // Inner loop1 for the star printing
            for(int j=1; j<=i; j++) {
                 
                // Printing the star without changing the line
                System.out.print("*");
            }
             
            // Inner loop2 for the space printing
            for(int k=1; k<=2*(n-i); k++) {
                 
                // Printing the space without changing the line
                System.out.print(" ");
            }
             
            // Inner loop3 for the again star printing
            for(int l=1; l<=i; l++) {
                 
                // Printing the star without changing the line
                System.out.print("*");
            }
             
            // Line/Row change
            System.out.println();
        }
    }
}