import java.util.Scanner;

public class pantinverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int h = (2*n)-1, b;
        int a = h%2;
        if (a==1) b=0;
        else b=1;
        for (int i=1;i<=n;i++)
        {
            for (int j=0; j<i; j++)
            {
                System.out.print("* ");
            }
            for (int j=i;j<n;j++)
            {
                System.out.print("  ");
            }


        for (int j=1; j<(2*(n)); j++)
            {
                if (i%2==1)
                {
                    if (j>=(n-i) && j<=(n+i) && j%2==a)
                    System.out.print("*");
                    else
                    System.out.print(" ");
                }
                // System.out.print("* ");
                else
                {
                    if (j>=(n-i) && j<=(n+i) && j%2==b)
                    System.out.print("*");
                    else
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}

// import java.util.Scanner;

// public class pantinverse {
//     public static void main(String[] args) {
//         int n;
//         try (Scanner a = new Scanner(System.in)) {
//             System.out.print("Enter number of rows: ");
//                 n=a.nextInt();
//         }
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             for (int k = 1; k <= 2 * (n - i); k++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }