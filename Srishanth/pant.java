import java.util.Scanner;
public class pant{

    public static void main(String[] args){
        Scanner w=new Scanner(System.in);
        int n=w.nextInt();

        for(int i=0;i<n;i++){

            System.out.print("*");

        }

        System.out.println("");

        for(int g=(n%2==1)?1:2;(n-g)/2!=0;g=g+2){

            int s = (n-g)/2;

            for(int i=s;i>=1;i--){

                System.out.print("*");

            }

            for(int i=0;i<g;i++){

                System.out.print(" ");

            }

            for(int i=s;i>=1;i--){

                System.out.print("*");

            }

            System.out.println("");

        }

    }

}