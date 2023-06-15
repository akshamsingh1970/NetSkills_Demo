import java.util.Scanner;

public class ReversePantPrint {

    public static void main(String[] args){

        // creating a scanner object
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int rows = myObj.nextInt();

        // now we'll print the pattern
        for(int i=1;i<=rows;i++){
            // for initial pattern
            for(int j=1; j<=i; j++)
                System.out.print("*");

            for(int k=1;k<=9-2*i;k++)
                System.out.print(" ");

            for(int z=1;z<=i;z++)
                System.out.print("*");

            System.out.print("\n");
        }
    }
}
