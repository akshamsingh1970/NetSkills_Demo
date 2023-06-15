package HomeWork2;
import java.util.Scanner;

public class PantsPattern2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        scanner.close();

        printPattern(rows);
    }

    public static void printPattern(int rows) {
        for (int i = rows; i >=1; i--) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < rows - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // last row
        for (int i = 0; i < 2 * rows - 1; i++) {
            System.out.print('*');
        }
        System.out.println();
    }
}
