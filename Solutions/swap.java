import java.util.Scanner;

class swap {
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        int a,b;
        System.out.println("Enter two numbers ");
        a=s.nextInt();
        b=s.nextInt();
        System.out.println("Before swapping: a = "+a+" and b = "+b);
        int tmp=a;
        a=b;b=tmp;
        System.out.println("After swapping: a = "+a+" and b = "+b);
    }
}