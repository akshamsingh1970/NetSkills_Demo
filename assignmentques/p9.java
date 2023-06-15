import java.util.*;
public class p9 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=n;
        for(int i=0;i<=n;i++)
        {
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            space=space-1;
            System.out.println();
        }
        space=1;
        for(int i=n;i>0;i--)
        {
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            for(int k=i-1;k>=1;k--)
            {
                System.out.print("* ");
            }
            space=space+1;
            System.out.println();
        }
    }
}