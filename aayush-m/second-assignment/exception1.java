import java.util.*;
public class exception1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int b;
        try {
            System.out.println("Enter a: ");
            a = in.nextInt();
            System.out.println("Enter b: ");
            b = in.nextInt();
            int div = a/b;
            System.out.println("Division is: "+div);
        } catch (Exception e) {
            System.out.println(e);
        }
        in.close();
    }
}