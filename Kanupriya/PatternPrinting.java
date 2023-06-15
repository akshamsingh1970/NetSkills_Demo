import java.util.Scanner;

public class PatternPrinting{
    public static void main(String[] args){

        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the number of rows for pattern: ");
        int rows = myObj.nextInt();

        for(int i=1;i<=rows;i++){

            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }

            System.out.print("\n");
        }

        //System.out.println("");

        for(int i=1;i<rows;i++){

            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=rows-i;j++){
                System.out.print("* ");
            }

            System.out.println("");
        }
    }
}
