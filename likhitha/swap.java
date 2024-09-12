import java.util.Scanner;

class swap {
    public static void main(String[] arg){
        try (Scanner s = new Scanner(System.in)) {
            int a,b;
            System.out.println("Enter two numbers ");
            a=s.nextInt();
            b=s.nextInt();
            System.out.println("Numbers before swapping are a = "+a+" b = "+b);
            int tmp=a;
            a=b;b=tmp;
            System.out.println("Numbers after swapping are a = "+a+" b = "+b);
        }
    }
}
