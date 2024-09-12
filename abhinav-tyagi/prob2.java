import java.util.ArrayList;
import java.util.List;

public class prob2 {
    public static void main(String[] args) {
        List<Integer> primeNumbers = new ArrayList<>();

        // Loop through all numbers from 2 to 20
        for (int i = 2; i <= 20; i++) {

            // Check if the number is prime
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            // If the number is prime, add it to the list
            if (isPrime) {
                primeNumbers.add(i);
            }
        }

        // Print the prime numbers in the list
        System.out.println("The prime numbers between 1 and 20 are:");
        for (int primeNumber : primeNumbers) {
            System.out.print(primeNumber + " ");
        }
    }
}
