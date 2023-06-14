import java.sql.SQLSyntaxErrorException;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        int[][] matrixA = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrixB = {{10,11,12},{13,14,15},{16,17,18}};

        int[][] matrixC = MatrixAdd(matrixA, matrixB);

        System.out.println("Matrix addition output:");
        Printmatrix(matrixC);

        System.out.println();

        PrintPattern();

    }

    public static int[][] MatrixAdd(int[][] matrixA, int[][]matrixB){
        int rows = matrixA.length;
        int cols = matrixB[0].length;
        int[][] matrixC = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrixC[i][j] = matrixA[i][j]+matrixB[i][j];
            }
        }
        return matrixC;
    }

    public static void Printmatrix(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void PrintPattern(){
        int num = 5;
        String str = "* ";
        for(int i=1;i<=num;i++){
            String repeat = str.repeat(i);
            System.out.println(repeat);
        }
    }
}