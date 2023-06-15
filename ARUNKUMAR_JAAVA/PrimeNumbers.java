public class PrimeNumbers {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimeNumbers(int start, int end) {
        System.out.print("Prime numbers between " + start + " and " + end + " are: ");
        for (int number = start; number <= end; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printPrimeNumbers(1, 20);
    }
}