public class EvenOddNumbers {
    public static void printEvenAndOddNumbers(int start, int end) {
        System.out.println("Even numbers between " + start + " and " + end + ":");
        for (int number = start; number <= end; number++) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();

        System.out.println("Odd numbers between " + start + " and " + end + ":");
        for (int number = start; number <= end; number++) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printEvenAndOddNumbers(1, 20);
    }
}