package HomeWork2;
import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            // int counter = 1;
            // String sf1 = String.format("%4d ", counter);
            for (int i = 0; i < 2 * n; i++) {
                int totalColsInRow = i > n ? 2 * n - i : i;
                int spaces = n - totalColsInRow;
                for (int j = 0; j < spaces; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < totalColsInRow; j++) {
                    System.out.print("* ");
                    
                }
                System.out.println();
            }
        }
    }
}

