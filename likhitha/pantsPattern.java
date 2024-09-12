import java.util.Scanner;

public class pantsPattern {
    public static void main(String[] args) {
        int n;
        try (Scanner a = new Scanner(System.in)) {
            System.out.print("Enter number of rows: ");
                n=a.nextInt();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
