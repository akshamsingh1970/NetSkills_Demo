import java.util.Scanner;
public class PrimeNo{
public static boolean isPrime(int n){
    if(n==0 || n==1){
        return false;
    }
    for(int i=2;i<=n/2;i++){
        if(n%i==0){
            return false;
        }
    }
    return true;
}
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int i,n;
        System.out.println("enter value of n");
        n = sc.nextInt();
        System.out.println("Prime nos from 1 to "+n+" are:");
        for(i=1;i<=n;i++){
              if(isPrime(i)){
                System.out.println(i);
              }
            }
        }
    }
