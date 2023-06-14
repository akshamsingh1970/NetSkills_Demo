import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x, b;
        int a = n%2;
        if (a==1) b=0;
        else b=1;
        for (int i=1;i<(2*n);i++)
        {
            if (i<=n)
                x=i;
            else
                x=(2*n)-i;
            for (int j=1; j<(2*n); j++)
            {
                if (x%2==1)
                {
                    if (j>=(n-x) && j<=(n+x) && j%2==a)
                    System.out.print("*");
                    else
                    System.out.print(" ");
                }
                // System.out.print("* ");
                else
                {
                    if (j>=(n-x) && j<=(n+x) && j%2==b)
                    System.out.print("*");
                    else
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
