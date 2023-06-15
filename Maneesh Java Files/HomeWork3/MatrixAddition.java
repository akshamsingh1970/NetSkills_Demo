package HomeWork3;
class MatrixAddition{
    public static void printMatrix(int[][] matrix,int m, int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.print('\n');
        }
    }
    
    public static void main(String [] args){
        int[][] a = {{1,2},{3,4}};
        int[][] b = {{5,6},{7,8}};
        int[][] c = new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        printMatrix(a,2,2);
        System.out.print("----------------------\n");
        printMatrix(b,2,2);
        System.out.print("Matrix after addition\n");
        printMatrix(c,2,2);
    }
}