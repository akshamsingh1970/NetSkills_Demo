public class factorial {
    public static void main(String[] args) {
        // Finding factorial of a number
        System.out.println("Finding factorial of a number");
        int n = 8;
        System.out.println("Factorial of " + n + " is " + findFactorial(n));  
    }

    public static int findFactorial(int n) {
        if(n == 1)
            return n;
        else
            return n * findFactorial(n - 1);
    }
}
