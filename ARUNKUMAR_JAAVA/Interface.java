interface DivisorCalculator {

    int calculateSumOfDivisors(int n);

}

class DivisorCalculatorImpl implements DivisorCalculator {

    @Override
    public int calculateSumOfDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        
        return sum;
    }
}


public class Interface {

    public static void main(String[] args) {
        DivisorCalculator calculator = new DivisorCalculatorImpl();
        int n = 9;
        int sumOfDivisors = calculator.calculateSumOfDivisors(n);
        System.out.println("Sum of divisors of " + n + " is: " + sumOfDivisors);
    }

}