import java.util.Scanner;

public class diamond {
    public static void main(String args[]){
        int n;
        try (Scanner a = new Scanner(System.in)) {
            System.out.print("Enter number of rows: ");
                n=a.nextInt();
        }
        for(int i=0;i<=n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
