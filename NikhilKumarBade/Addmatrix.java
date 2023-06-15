
import java.util.*;
public class Addmatrix {
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        int m1,m2;
        System.out.println("Enter size of matrices");
        m1=s.nextInt();
        m2=s.nextInt();
        System.out.println("Enter elements of matrix 1");
        int [][] mat1=new int[m1][m2];
        for(int i=0;i<m1;i++)
        {
            for(int j=0;j<m2;j++)
            mat1[i][j]=s.nextInt();
        }
        int [][] mat2=new int[m1][m2];
        System.out.println("Enter elements of matrix 2");
        for(int i=0;i<m1;i++)
        {
            for(int j=0;j<m2;j++)
            mat2[i][j]=s.nextInt();
        }
        for(int i=0;i<m1;i++)
        {
            for(int j=0;j<m2;j++)
            mat1[i][j]=mat1[i][j]+mat2[i][j];
        }
        System.out.println("New elements of matrix 1 are ");
        for(int i=0;i<m1;i++)
        {
            for(int j=0;j<m2;j++)
            System.out.print(" "+mat1[i][j]+" ");
            System.out.println();
        }

    }
}
