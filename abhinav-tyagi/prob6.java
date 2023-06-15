import java.util.Scanner;

public class prob6 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();

    // Calculate the factorial
    long factorial = 1;
    for (int i = 1; i <= n; i++) {
      factorial *= i;
    }

    // Print the factorial
    System.out.println("The factorial of " + n + " is " + factorial);
  }
}