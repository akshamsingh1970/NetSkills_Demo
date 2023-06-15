import java.util.Scanner;

public class PantPrint {

    public static void main(String[] args){

        // creating a scanner object
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the no. of rows : ");
        int row = myObj.nextInt();

        for(int i=1; i<=row+1; i++){

            for(int j=1; j<=row-i+1;j++)
                System.out.print("*");

            // for spaces
            for(int k=2;k<2*i;k++)
                System.out.print(" ");

            // for right half
            for(int z=1;z<=row-i+1;z++)
                System.out.print("*");

            System.out.print("\n");
        }
    }
}
