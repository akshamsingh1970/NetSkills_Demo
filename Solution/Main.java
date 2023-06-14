

interface DivisorSumCalculator {

    int calculateDivisorSum(int number);

}


class DivisorSumCalculatorImpl implements DivisorSumCalculator {

    @Override

    public int calculateDivisorSum(int number) {

        int sum = 0;

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {

                sum += i;

            }

        }

        return sum;

    }

}


public class Main {

    public static void main(String[] args) {

        int number = 12;

        DivisorSumCalculator calculator = new DivisorSumCalculatorImpl();

        int divisorSum = calculator.calculateDivisorSum(number);

        System.out.println("Sum of divisors of " + number + " is: " + divisorSum);

    }

}
