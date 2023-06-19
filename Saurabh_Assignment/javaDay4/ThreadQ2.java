/*

2-	Write a program to create the 3 sub thread classes where first class print the sum of prime number 
between 1 to 50 and second class print the missing number from the array and third class print the 
initilize caracter count of string like- if input String is String input = "aabbbccddaaabbccceeff"; 
then output should be like this- output = a2b3c2d2a3b2c3e2f2"
Now create 3 thread where thread executes only one task.

*/
import java.lang.*;
import java.util.*;// Random 
class Thread1 implements Runnable{
    public Boolean isPrime(int a){
        if(a == 1) return false;

        Boolean isIt = true;
        for(int i=2; i<=Math.sqrt(a); i++){
            if(a%i == 0){
                isIt = false;
                break;
            }else continue;
        }

        return isIt;
    }

    @Override
    public void run(){
        int sum = 0;
        for(int i=1; i<=50; i++){
            if(isPrime(i)) sum+=i;
        }

        System.out.println(Thread.currentThread().getName()+": sum of prime nums = "+sum);
    }
}

class Thread2 implements Runnable{
    @Override
    public void run(){
        Scanner sc = new Scanner(System.in);
        int sz;
        System.out.print("Enter the size of random arr: ");
        sz = sc.nextInt();

        int[] arr = new int[sz];

        System.out.print("Enter elements: ");
        for(int i=0; i<sz; i++){
            arr[i] = sc.nextInt();
        }

        // Random rand = new Random();
        // for(int i=0; i<sz; i++){
        //     arr[i] = rand.nextInt(51);
        // }
        
        Boolean[] checks = new Boolean[50];  // default false
        Arrays.fill(checks, false); // assign same value to each elt

        for(int i=0; i<arr.length; i++){
            checks[arr[i]-1] = true;
        }

        System.out.print(Thread.currentThread().getName()+": ");
        for(int i=0; i<50; i++){
            if(checks[i] == false){
                System.out.print(i+1+" ");
            }
        }

        System.out.println();
    }
}

class Thread3 implements Runnable{
    @Override
    public void run(){
        String input = "aabbbccddaaabbccceeff";
        String res = "";
        for(int i=0; i<input.length(); i++){
            char curr = input.charAt(i);
            int j = i;
            int cnt = 0;
            while(j<input.length() && input.charAt(j) == curr){
                cnt++;
                j++;
            }

            i = j-1;
            res = res + curr + cnt;
        }

        System.out.print(Thread.currentThread().getName()+": "+res);
    }
}

class ThreadQ2{
    public static void main(String args[]){
        Thread1 r1 = new Thread1();
        Thread t1 = new Thread(r1);
        t1.start();

        try{
            t1.join();
        }catch(Exception e){
            System.out.println(e);
        }

        Thread2 r2 = new Thread2();
        Thread t2 = new Thread(r2);
        t2.start();

        try{
            t2.join();
        }catch(Exception e){
            System.out.println(e);
        }

        Thread3 r3 = new Thread3();
        Thread t3 = new Thread(r3);
        t3.start();

        try{
            t3.join();
        }catch(Exception e){
            System.out.println(e);
        }

    }
}