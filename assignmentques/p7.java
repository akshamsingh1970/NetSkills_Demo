public class p7 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Before swap\na: "+a+" b: "+b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swap\na: "+a+" b: "+b);
    }
}