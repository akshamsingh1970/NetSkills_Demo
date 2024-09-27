import java.util.Scanner;
public class Pattern {
   
       
    public static void main(String args[]){
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter N");
        N = sc.nextInt();
        int i=0,j=0;
        for(i=0;i<=N;i++){
            for(j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
