package NetSkills_Demo.codes.collections;

public class prob1 {
    public static void main(String[] args) {
        B b = new B();
        C c = new C(b);
        c.printSum(5, 3);
    }
}

class A {
    public int sum(int x, int y){
        return x + y;
    }
}

class B extends A {

}

class C {
    private B b;
     public C(B b) {
        this.b = b;
    }

    public void printSum(int num1, int num2) {
        int result = b.sum(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
    }
}