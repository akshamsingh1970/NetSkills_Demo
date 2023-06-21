package HomeWork3;
import java.util.*;
class Pattern1 {
    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.print('\n');
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter an integer");
            int n = sc.nextInt();
            printPattern(n);
        }
    }
}