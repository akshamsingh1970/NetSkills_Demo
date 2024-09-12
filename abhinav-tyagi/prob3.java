public class prob3 {
    public static void main(String[] args) {
        int num = 2;
        while (num <= 5) {
            System.out.println("Multiplication Table of " + num);
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + num * i);
            }
            num++;
        }
    }
}
