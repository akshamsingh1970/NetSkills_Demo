package NetSkills_Demo.codes;
import java.util.Scanner;

public class add_matrices {
    public static void main(String[] args) {
        int[][] twoD_arr = new int[3][3];
        int n=twoD_arr.length,m=twoD_arr[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                twoD_arr[i][i]=i-j;
            }
        }

        int[][] array_2 = new int[3][3];
        int l=array_2.length,b=array_2[0].length;

        for(int a=0;a<l;a++) {
            for(int c=0;c<b;c++){
                array_2[a][c]=a+c;
            }
        }
        
        System.out.println("adding the 2 arrays -");
        for(int i=0;i<twoD_arr.length;i++){
            for(int j=0;j<twoD_arr[0].length;j++){
                System.out.println(twoD_arr[i][j]+array_2[i][j]);
            }
        }

        System.out.print("Enter 2D array size : ");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows size");
        int rows=sc.nextInt();
        System.out.println("enter cols size");
        int columns=sc.nextInt();
        
        System.out.println("Enter array elements : ");    
            
        int twoD[][]=new int[rows][columns];
            
        for(int i=0; i<rows;i++)
        {            
            for(int j=0; j<columns;j++)
            {
                twoD[i][j]=sc.nextInt();
            }
        }

        System.out.print("Enter 2nd 2D array size : ");
        System.out.println("enter rows size of 2nd matrix");
        int rows2=sc.nextInt();
        System.out.println("enter cols size");
        int columns2=sc.nextInt();
        
        System.out.println("Enter array elements : ");    
            
        int twoD2[][]=new int[rows2][columns2];
         for(int i=0; i<rows2;i++)
        {            
            for(int j=0; j<columns2;j++)
            {
                twoD2[i][j]=sc.nextInt();
            }
        }

        for(int  i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(twoD[i][j]+twoD2[i][j]);
            }
            System.out.println();
        }

    }
}
