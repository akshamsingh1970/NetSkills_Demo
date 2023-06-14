/*
10->Write a Program to Print the Pant's style Star Pattern.

*********
**** ****
***   ***
**     **
*       *
*/
import java.util.Scanner;
public class Q10{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter breadth : ");
        int n  = obj.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i = 1; i <= n/2-(1-n%2);i++){
            for(int j = 1; j <= n/2-i+n%2; j++){
                System.out.print("*");
            }
            for(int j = 1; j <= 2*i-n%2; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= n/2-i+n%2; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}