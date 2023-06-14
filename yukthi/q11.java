public class q11 {

    public static void main(String[] args) {

        int n=5;

        for(int i=0;i<n;i++){

            if(i==n-1){

                for(int j=0;j<2*n-1;j++){

                    System.out.print("*");

                }

                System.out.print("\n");

                continue;

            }

            for(int j=i;j>=0;j--){

                System.out.print("*");

            }

            for(int j=0;j<2*(n-i-1)-1;j++){

                System.out.print(" ");

            }

            for(int j=i;j>=0;j--){

                System.out.print("*");

            }

            System.out.print("\n");

        }

    }

}