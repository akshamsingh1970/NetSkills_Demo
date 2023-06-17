import java.lang.Math;

public class printPrimes {
    public static void main(String[] args) {
        // Prime Composite
        System.out.println("Prime - Composite");
        System.out.println("1 is neither prime nor composite");
        for(int i = 2; i <= 20; i++) {
            Boolean isPrime = true;
            for(int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0)
                    isPrime = false;
            }
            if(isPrime) 
                System.out.println(i + " is prime");
            else
                System.out.println(i + " is composite");
        }
    }
}
