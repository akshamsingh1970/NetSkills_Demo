class Task{
    public static void main(String[] args){
        int[][]ar1={{1,2,3,4},{5,6,7,8}};
        int[][]ar2={{5,6,7,8},{1,2,3,4}};
        final int ar3[][]=new int[2][4];

        for(int i=0;i<ar1.length;i++){
            for(int j=0;j<ar2[0].length;j++){
                ar3[i][j]=ar1[i][j]+ar2[i][j];
            }
        }

        for(int i=0;i<ar3.length;i++){
            for(int j=0;j<ar3[0].length;j++){
                System.out.print(ar3[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}