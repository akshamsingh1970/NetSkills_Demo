
import java.io.*;
import java.util.*;
import java.lang.*;


class SumofPrimes implements Runnable{
    public void run(){
        int sum=0;
        for(int i=2;i<=50;i++){
            boolean a=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    a=false;
                }
            }
            if(a)sum+=i;
        }
        System.out.println("Sum of primes between 1 to 50 is: "+sum);
    }
}

class MissingNumbers implements Runnable{
    int [] arr;
    int n;
    MissingNumbers(int [] a,int sz){
        n=sz;
      arr=new int[n];
      for(int i=0;i<n;i++){
       arr[i]=a[i];
      }
    }
    public void run(){
        System.out.println("Missing numbers between 1 and 50 are: ");
        int [] newA=new int[50];
        for(int i=0;i<50;i++){
            newA[i]=0;
        }
      for(int i=0;i<n;i++){
             newA[arr[i]-1]=1;
      }
      for(int i=0;i<50;i++){
        if(newA[i]!=1){
            System.out.print((i+1)+" ");
        }
      }
      System.out.println();
    }
}

class StringProblem implements Runnable{
    String s;
    StringProblem(String str){
        s=str;
    }
    public void run(){
        char start=s.charAt(0);
        int count=1;
        String ans="";
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
              ans=ans+start+count;
              start=s.charAt(i);
              count=1;
              if(i==s.length()-1){
                ans=ans+start+count;
              }
            }else{
               count++;
               if(i==s.length()-1){
                ans=ans+start+count;
               }
            }
        }
        //ans+=start+count;
        System.out.println(ans);
    }
}


class ThreadsQ2{
public static void main(String[] args){
int sze;
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the size of the array <= 50: ");
        sze=sc.nextInt();
        int [] inputArray=new int[sze];
        System.out.println(" Enter the elements of the array between 1 to 50 : ");
        for(int i=0;i<sze;i++){
            inputArray[i]=sc.nextInt();
        }
        String inpString;
        System.out.println(" Enter the string for String problem : ");
        inpString=sc.next();
        System.out.println();
        SumofPrimes obj1=new SumofPrimes();
        MissingNumbers obj2=new MissingNumbers(inputArray,sze);
        StringProblem obj3=new StringProblem(inpString);
        Thread t1= new Thread(obj1, "Primes Thread");
        Thread t2=new Thread(obj2, "Missing Thread");
        Thread t3=new Thread(obj3,"String Thread ");
        t1.start();
        try{
            t1.join();
        }
        catch(Exception e){
         System.out.println(e);
        }
        t2.start();
        try{
            t2.join();
        }
        catch(Exception e){
         System.out.println(e);
     
        }
        t3.start();
        try{
            t3.join();
        }
        catch(Exception e){
         System.out.println(e);
           
        }
}
}