import java.util.HashSet;

public class subClassesMultiThreading {
    public static void main(String[] args) {
        Thread sumFinder = new Thread(new sumOfPrimes(1, 50));
        Thread encoder = new Thread(new encodeAlphabets("aabbbccddaaabbccceeff"));
        Thread missingPrinter = new Thread(new printMissing());

        sumFinder.start();
        encoder.start();
        missingPrinter.start();

        try {
            sumFinder.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        try {
            encoder.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        try {
            missingPrinter.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class sumOfPrimes implements Runnable {
    private int start;
    private int end;

    sumOfPrimes(int st, int en) {
        start = st;
        end = en;
    }

    @Override
    public void run() {
        int sum = 0;
        for(int i = Math.max(start, 2); i <= end; i++) {
            if(isPrime(i))  
                sum += i;
        }
        System.out.println("Sum of primes from " + start + " to " + end + " is " + sum);
        System.out.print("\n");
    }

    private Boolean isPrime(int n) {  
        for(int j = 2; j <= Math.sqrt(n); j++) {
            if(n % j == 0)
                return false;
        }
        return true;
    }
}

class printMissing implements Runnable {
    @Override
    public void run() {
        int[] numbers =  new int[] {1, 15, 10, 5, 21};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        HashSet<Integer> numbersSet = new HashSet<>();
        for(int x : numbers) {
            if(x > max)
                max = x;
            if(x < min)
                min = x;

            numbersSet.add(x);
        }

        for(int i = min; i <= max; i++) {
            if(!numbersSet.contains(i))
                System.out.print(i + " ");
        }
        System.out.print("\n");
    }
}

class encodeAlphabets implements Runnable {
    private String str;

    encodeAlphabets(String input) {
        str = input;
    }

    @Override
    public void run() {
        for(int i = 0; i < str.length(); ) {
            char currentChar = str.charAt(i);
            int currentCount = 1;

            i += 1;
            while(i < str.length() && str.charAt(i) == currentChar) {
                i += 1;
                currentCount += 1;
            }
            
            System.out.print(currentChar);
            System.out.print(currentCount);
        }
        System.out.print("\n");
    }
}
