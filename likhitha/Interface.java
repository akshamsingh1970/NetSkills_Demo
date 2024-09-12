// Interface

import java.util.Scanner;

interface DivisorSum {
    int getSumOfDivisors(int n);
}

// Class implementing the interface
class DivisorSumCalculator implements DivisorSum {
    public int getSumOfDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

// Main class to test the implementation
class sumOfDivisors {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            DivisorSumCalculator calculator = new DivisorSumCalculator();
            int number=s.nextInt();
            int sumOfDivisors = calculator.getSumOfDivisors(number);
            System.out.println("Sum of divisors of " + number + " is: " + sumOfDivisors);
        }
    }
}
