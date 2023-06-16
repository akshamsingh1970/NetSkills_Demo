import java.io.*;
import java.util.*;
import java.lang.*;


class PrintingUsingMultipleThreads implements Runnable{
       int remainder;
       static int start=1;
       int Num;
        static Object lock=new Object();
       PrintingUsingMultipleThreads(int k,int n){
        this.remainder=k;
        this.Num=n;
       }
       public void run(){
          while(start<=Num){
            synchronized(lock){
                if(start%5!=remainder){
                  try{lock.wait();}
                  catch(Exception e){
                    System.out.println(e);
                  }
                }else{
                   System.out.println(Thread.currentThread().getName()+" Printed "+start);
                   start++;
                   lock.notifyAll();
                }
            }
          }
       }
}


class ThreadsQ3{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number n: ");
        n=sc.nextInt();
        PrintingUsingMultipleThreads obj1=new PrintingUsingMultipleThreads(0,n);
        PrintingUsingMultipleThreads obj2=new PrintingUsingMultipleThreads(1,n);
        PrintingUsingMultipleThreads obj3=new PrintingUsingMultipleThreads(2,n);
        PrintingUsingMultipleThreads obj4=new PrintingUsingMultipleThreads(3,n);
        PrintingUsingMultipleThreads obj5=new PrintingUsingMultipleThreads(4,n);
        Thread t1=new Thread(obj1," Thread 1");
        Thread t2=new Thread(obj2," Thread 2");
        Thread t3=new Thread(obj3," Thread 3");
        Thread t4=new Thread(obj4," Thread 4");
        Thread t5=new Thread(obj5," Thread 5");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


    }
}