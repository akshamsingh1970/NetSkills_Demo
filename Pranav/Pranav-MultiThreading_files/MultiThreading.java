class threadClass implements Runnable {
    private int start;
    private int end;
    public threadClass(int start,int end){
        this.start=start;
        this.end=end;
    }
    @Override
    public void run() {
        System.out.println("Thread with Start Number="+start+" and End Number="+end+" has STARTED!!!");
        for(int i=start;i<=end;i++){
            System.out.println(i);
        }
        System.out.println("Thread with Start Number="+start+" and End Number="+end+" has ENDED!!!");
    }
}

public class MultiThreading {
    public static void main(String[] args) throws InterruptedException {
        threadClass tc1=new threadClass(1,5);
        Thread t1=new Thread(tc1);
        threadClass tc2=new threadClass(6,10);
        Thread t2=new Thread(tc2);
        threadClass tc3=new threadClass(11,15);
        Thread t3=new Thread(tc3);
        threadClass tc4=new threadClass(16,20);
        Thread t4=new Thread(tc4);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        t4.start();
    }
}
