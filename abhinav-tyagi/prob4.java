public class prob4 {
  public static void main(String[] args) {

    // Print odd numbers
    System.out.println("Odd numbers:");
    for (int i = 1; i <= 20; i++) {
      if (i % 2 != 0) {
        System.out.println(i);
      }
    }

    // Print even numbers
    System.out.println("Even numbers:");
    for (int i = 2; i <= 20; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }
  }
}
