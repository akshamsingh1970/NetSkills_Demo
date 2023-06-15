package A2;
import java.util.*;
public class Diamond {
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Enter size of diamond ");
        n=s.nextInt();
        if(n%2==0)
        {
        pyramaid p= new pyramaid();
        p.pyramaid(n/2);
        int n1=n/2;
        reverse_pyramaid r=new reverse_pyramaid();
        r.pyramaid(n-n1);
        }
        else
        {
            int k;
            if((n/2)%2==0)
            {
                for(int i=0;i<=n/2;i++)
        {
            k=i+1;
            for(int j=0;j<n;j++)
            {
                if((i+j)<n/2)
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
        for(int i=n/2-1;i>=0;i--)
        {
            k=i+1;
            for(int j=0;j<n;j++)
            {
                if((i+j)<n/2)
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
            else{
                for(int i=0;i<=n/2;i++)
        {
            k=i+1;
            for(int j=0;j<n;j++)
            {
                if((i+j)<n/2)
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
        for(int i=n/2-1;i>=0;i--)
        {
            k=i+1;
            for(int j=0;j<n;j++)
            {
                if((i+j)<n/2)
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

        }
    }
}
