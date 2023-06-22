/* 1-	 Write a program to print the 1 to 5 numbers with thread name with the help of 4 thread and 
your thread execution like – First thread completed, then second started and completed, then third 
started etc.*/

class ThreadQ1 implements Runnable{
    @Override
    public void run(){
        System.out.print(Thread.currentThread().getName()+": ");
        // print 1-5
        for(int i=1; i<=5; i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        for(int i=1; i<=5; i++){
            ThreadQ1 tq = new ThreadQ1();
            Thread t = new Thread(tq);
            t.start();
            try{
                t.join();
            }catch(InterruptedException ie){
                System.out.println(ie);
            }
        }
    }
}