public class MatrixAddition {
    public static void main(String[] args){

        // creating two matrices
        int a[][]={{1,3,4},{2,4,3},{3,4,5}};
        int b[][]={{1,2,3},{4,5,6},{1,2,3}};

        // creating a resultant matrix
        int c[][]=new int[3][3];

        // Implementing the actual logic
        for(int i=0;i<=2;i++){

            for(int j=0;j<=2;j++){

                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
