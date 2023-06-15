package A2;
import java.util.*;
public class third_highest {
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Enter size of array ");
        n=s.nextInt();
        System.out.println("Enter values of array ");
        int [] a= new int[n];
        for(int i=0;i<n;i++) 
        a[i] = s.nextInt();
        int h1=a[0];
        for(int i=1;i<n;i++)
        {
            if(a[i]>h1)
            h1=a[i];
        } 
        int h2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(a[i]==h1)
            continue;
            else
            {
                if(a[i]>h2)
                h2=a[i];
            }
        }
        if(h2==Integer.MIN_VALUE)
        h2=h1;
        int h3=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(a[i]==h1 || a[i]==h2)
            continue;
            else
            {
                if(a[i]>h3)
                h3=a[i];
            }
        }
        if(h3==Integer.MIN_VALUE)
        h3=h2;
        System.out.println("Third highest element of array is "+h3);
    }
}
