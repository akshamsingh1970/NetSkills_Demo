
// 2->Write a program to print the prime number between 1 to 20.
// 2, 3, 5, 7, 11, 13, 17, 19
import java.lang.Math.*;
class PrimeNums{
    public static void main(String args[]){
        for(int i=2; i<=20; i++){
            int num = i;
            boolean isPrime = true;
            for(int j=2; j<=Math.sqrt(num); j++){
                if(num==2){
                    System.out.print("2 ");
                }else{
                    if(num%j == 0){
                        isPrime = false;
                        break;
                    }
                }
            }
            if(isPrime){
                System.out.print(num+" ");
            }
        }
    }

}