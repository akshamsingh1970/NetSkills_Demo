public class prime {

    static int isprime(int n) {
        for (int i=2;i<n;i++) {
            if (n%i==0)
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        for (int i = 2; i <= 20; i++) {
            if (isprime(i)==0)
            System.out.println(i+" ");
        }
    }
}