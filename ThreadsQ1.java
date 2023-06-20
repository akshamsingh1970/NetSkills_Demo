 
 class PrintingNumbers implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" Printed "+ i);
        }
    }
 }
 
 
 
 class ThreadsQ1{
  public static void main(String [] args){
     PrintingNumbers obj=new PrintingNumbers();
        Thread t1=new Thread(obj, " Thread 1");
        Thread t2=new Thread(obj, " Thread 2");
        Thread t3=new Thread(obj, " Thread 3");
        Thread t4=new Thread(obj, " Thread 4");
        t1.start();
        try{
        t1.join();
        }catch(Exception e){
            System.out.println(e);
        }
        t2.start();
        try{
        t2.join();
        }catch(Exception e){
            System.out.println(e);
        }
        t3.start();
        try{
        t3.join();
        }catch(Exception e){
            System.out.println(e);
        }
        t4.start();
        try{
        t4.join();
        }catch(Exception e){
            System.out.println(e);
        }
  }
}