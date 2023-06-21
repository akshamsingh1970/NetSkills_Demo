package HomeWork3;
import java.util.Scanner;

class Base {

    int add(int a, int b) {
        return a + b;
    }
}

class Derived extends Base {

}

public class Inheritance {
    public static void main(String[] args) {
        Base a = new Derived();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter both elements: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(a.add(num1, num2));
        sc.close();
    }
}
