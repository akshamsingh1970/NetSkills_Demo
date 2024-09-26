

public class Factorial{

    public static void main(String[] args) {
        // List<Long> numbers = LongStream.range(1, n).boxed().toList();
        // long factorial = numbers.stream().reduce(1L, (x,y)-> x*y);
        // System.out.println(factorial);
        int num = 4;
        FactorialInterface f1 = (n) -> {
            long prod = 1;
            for(int i = 1; i <= n; i++)
                prod *= i;
            return prod;
        };
        long ans = f1.calculate(num);
        System.out.println(ans);
    }
}

@FunctionalInterface
    interface FactorialInterface    {
        long calculate(int n);
    }