import java.util.*;
class factorial{
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number ");
        int n=s.nextInt();
        int fac=1;
        for(int i=1;i<=n;i++)
        fac=fac*i;
        System.out.println("The factorial of "+n+" is "+fac);
    }
}