//First class

import java.util.Scanner;

class FirstClass {
    public int sumIntegers(int a, int b) {
        return a + b;
    }
}

// Second Class inheriting from FirstClass
class SecondClass extends FirstClass {
    // No additional methods or properties in this class
}

// Third Class printing output of FirstClass method using SecondClass object
class ThirdClass {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n1=s.nextInt();
            int n2=s.nextInt();
            SecondClass secondObj = new SecondClass();
            int result = secondObj.sumIntegers(n1, n2);
            System.out.println("Sum: " + result);
        }
    }
}