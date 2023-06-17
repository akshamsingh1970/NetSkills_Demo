public class sumOfDivisors {
    public static void main(String[] args) {
        int n = 8;
        actualClass sumFinder = new actualClass();
        System.out.println("Sum of all divisors of " + n + " is " + sumFinder.findDivisorsSum(n));
    }
}

interface baseClass {
    public int findDivisorsSum(int n);
}

class actualClass implements baseClass {
    public int findDivisorsSum(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0)
                sum += i;
        }
        return sum;
    }
}
