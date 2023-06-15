import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args){
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        N = sc.nextInt();
        System.out.println("Even numbers between 1 to "+N+" are:");
        for(int i=1;i<=N;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
         System.out.println();
         System.out.println("Odd numbers between 1 to "+N+" are:");
         for(int i=1;i<=N;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}
