public class p6 {
    public static void main(String[] args) {
        int fact = 1;
        for(int i = 1; i <= 8; i++) {
            fact *= i;
        }
        System.out.println("8th factorial is: "+fact);
    }
}