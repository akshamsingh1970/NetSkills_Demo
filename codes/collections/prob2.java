package NetSkills_Demo.codes.collections;
import java.util.*;

public class prob2 {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println("enter a number to find its divisors sum");
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        System.out.println(t.divSum(a));
    }
}

class Test implements testFunctionality {
    public int divSum(int a) {
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}


interface testFunctionality {
    int divSum(int a);
}
