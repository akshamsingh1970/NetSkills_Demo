class q9 {

    public static void main(String[] args) {

        System.out.println("Hello, World!");

        int n=5;

        for(int i=0;i<(n+1);i++){




            for(int j=n-i;j>=0;j--){

                System.out.print(" ");

            }

            for(int j=i;j>=0;j--){

                System.out.print("* ");

            }

            System.out.print("\n");

        }




        for(int i=0;i<(n);i++){




            for(int j=n-i-1;j<=n;j++){

                System.out.print(" ");

            }

            for(int j=i;j<n;j++){

                System.out.print("* ");

            }

            System.out.print("\n");

        }

    }

}