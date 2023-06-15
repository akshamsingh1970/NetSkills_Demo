package A2;
import java.util.*;
public class pant {
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Enter size of pant ");
        n=s.nextInt();
        if(n%2==0)
        {
            for(int i=n-1;i>=0;i--)
            {
                for(int j=0;j<2*n;j++)
                {
                    if(j<=i)
                    System.out.print("*");
                    else
                    {
                        if(j+i>=2*n-1)
                        System.out.print("*");
                        else
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        else
        {
            for(int i=n-1;i>=0;i--)
            {
                for(int j=0;j<2*n-1;j++)
                {
                    if(j<=i)
                    System.out.print("*");
                    else
                    {
                        if(j+i>=2*n-2)
                        System.out.print("*");
                        else
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
}
    }
