public class printEvenOdd {
    public static void main(String[] args) {
        // Even Odd 
        System.out.println("Even - Odd");
        for(int i = 1; i <= 20; i++) {
            if(i % 2 == 0) {
                System.out.println(i + " is even");
            }
            else {
                System.out.println(i + " is odd");
            }
        }
    }
}
