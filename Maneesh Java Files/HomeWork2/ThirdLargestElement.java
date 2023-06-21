package HomeWork2;

import java.util.Scanner;

public class ThirdLargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        if (size < 3) {
            System.out.println("Array has less than 3 elements.");
        } else {
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;
            int thirdLargest = Integer.MIN_VALUE;

            for (int i = 0; i < size; i++) {
                int current = array[i];

                if (current > largest) {
                    thirdLargest = secondLargest;
                    secondLargest = largest;
                    largest = current;
                } else if (current > secondLargest && current < largest) {
                    thirdLargest = secondLargest;
                    secondLargest = current;
                } else if (current > thirdLargest && current < secondLargest) {
                    thirdLargest = current;
                }
            }
            System.out.println("The third largest element in the array is: " + thirdLargest);
        }

        scanner.close();
    }
}
