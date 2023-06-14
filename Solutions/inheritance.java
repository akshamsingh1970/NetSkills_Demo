import java.util.*;

class class1 {

    public int num1;
    public int num2;

    public class1 (int a, int b) {
        this.num1 = a;
        this.num2 = b;
    }
    public int sum(int a, int b) {
        return (num1+num2);
    }
}

class class2 extends class1 {
    public class2 (int a, int b) {
        super(a,b);
    }
}

public class inheritance {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a, b;
        System.out.println("Enter 2 numbers to be added : ");

        a = s.nextInt();
        b = s.nextInt();

        class2 obj = new class2 (a,b);
        System.out.println(obj.sum(a,b));

    }
}