import java.util.Scanner;

public class addmatrix {
    
    static void addel (int [][] arr, int a, int b) {
        Scanner s = new Scanner(System.in);
        int el;
        for (int i=0;i<a;i++){
            for (int j=0;j<b;j++) {
                el=s.nextInt();
                arr[i][j] = el;
            }
        }
    }


    public static void main(String[] args) {

        // addmatrix obj = new addmatrix();
        Scanner s = new Scanner(System.in);
        int a,b;
        System.out.println("Enter number of rows and columns ");
        a=s.nextInt();
        b=s.nextInt();
        int arr1 [][] = new int [a][b];
        int arr2 [][] = new int [a][b];
        int sol [][] = new int [a][b];
        System.out.println("Enter elements of arr 1 ");
        addel(arr1, a, b);

        System.out.println("Enter elements od arr 2 ");
        addel(arr2,a,b);

        for (int i=0;i<a;i++){
            for (int j=0;j<b;j++) {
                sol [i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        String row;
        System.out.println("Sum : ");
        for (int i=0;i<a;i++){
            row = "";
            for (int j=0;j<b;j++) {
                row += sol[i][j] + " ";
            }
            System.out.println(row);
        }
    }

}