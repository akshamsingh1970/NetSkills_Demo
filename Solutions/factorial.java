import java.util.*;
class factorial  {


    static int fact(int n) {
        if (n==0 || n==1)
        return 1;
        else
        return n *fact(n-1);
    }

    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number ");
        int n=s.nextInt();
        int fac=fact(n);
        System.out.println("The factorial of "+n+" is "+fac);
    }
}