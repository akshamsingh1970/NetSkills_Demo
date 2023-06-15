package A2;
import java.util.*;
public class reverse_pyramaid {
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Enter size of pyramaid ");
        n=s.nextInt();
        pyramaid(n);
    }
    static void pyramaid (int n)
    {
        int k;
        if(n%2==0)
        {
            for(int i=n-1;i>=0;i--)
        {
            k=i+1;
            for(int j=0;j<2*n-1;j++)
            {
                if((i+j)<n-1)
                System.out.print(" ");
                else{
                    if((i+j)%2!=0 && k!=0)
                    {
                    System.out.print("*");
                    k--;
                    }
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
            k=i+1;
            for(int j=0;j<2*n-1;j++)
            {
                if((i+j)<n-1)
                System.out.print(" ");
                else{
                    if((i+j)%2==0 && k!=0)
                    {
                    System.out.print("*");
                    k--;
                    }
                    else
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
}
