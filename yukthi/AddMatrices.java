import java.util.Scanner;
 
class AddMatrices{
    public static void main(String args[]){
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];
        int i=0,j=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first matrix");
        for(i=0;i<a.length;i++){
            for(j=0;j<a[i].length;j++){
                a[i][j] = sc.nextInt();
            }
        }
         System.out.println("enter the second matrix");
        for(i=0;i<b.length;i++){
            for(j=0;j<b[i].length;j++){
                b[i][j] = sc.nextInt();
            }
        }
         System.out.println("Adding the matrices");
        for(i=0;i<a.length;i++){
            for(j=0;j<b[i].length;j++){
                c[i][j] = a[i][j]+b[i][j];
            }
       
         System.out.println("Resultant Matrix:");
        for(i=0;i<c.length;i++){
            for(j=0;j<c[i].length;j++){
                System.out.println(c[i][j]);
            }
        }
 
    }
}
}