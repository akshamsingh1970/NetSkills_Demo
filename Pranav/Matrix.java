public class Matrix{
    public static void main(String[] args){
//        System.out.println("Hi");
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};
        int[][] b={{-1,-2,-3},{-4,-5,-6},{-7,-8,-9}};
        System.out.println("Matrix a: ");
        printMatrix(a);
        System.out.println("Matrix b: ");
        printMatrix(b);
        System.out.println("Sum of the Matrices a + b is: ");
        printMatrix(addMatrices(a,b));
    }

    private static int[][] addMatrices(int[][] a, int[][] b){
        int[][]sumMatrix= new int[a.length][a[0].length];
        for(int i=0;i< a.length ;i++){
            for(int j=0;j<a[0].length;j++){
                sumMatrix[i][j]=a[i][j]+b[i][j];
            }
        }
        return sumMatrix;
    }
    public static void printMatrix(int[][] a){
        for(int i=0;i< a.length ;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}