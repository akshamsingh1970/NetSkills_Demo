public class reversepant{

    public static void main(String[] args){

        int n = 10;

        for(int i=n-2;i>0;i-=2){

            int p = (n-i)/2;

            for(int j=p;j>0;j--){

                System.out.print("*");

            }

            for(int u=0;u<i;u++){

                System.out.print(" ");

            }

            for(int w=p;w>=1;w--){

                System.out.print("*");

            }

            System.out.println("");

        }

        for(int q=0;q<n;q++){

            System.out.print("*");

        }

        System.out.println("");

    }

}