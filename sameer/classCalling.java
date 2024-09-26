public class classCalling {
    public static void main(String[] args) {
        class3 obj_class3 = new class3();
        obj_class3.call();
    }
}

class class1 {
    public int addNumbers(int a, int b) {
        return a + b;
    }
}

class class2 extends class1 {}

class class3 {
    public void call() {
        class2 obj_class2 = new class2();
        int res = obj_class2.addNumbers(10, 5);
        System.out.println("Called class1's function using class2, to add 10 and 5, \nwhich gave answer " + res);
    }
}
