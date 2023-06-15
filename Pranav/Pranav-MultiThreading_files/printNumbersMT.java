public class printNumbersMT {
    public static void main(String[] args){
        for(int i=1;i<=printNumbersThread.threadCount;i++) {
            printNumbersThread tc1 = new printNumbersThread(i);
            Thread t1=new Thread(tc1);
            t1.start();
        }
    }
}
class printNumbersThread implements Runnable{
    private int threadId;
    public static Object lock= new Object();;
    public static int threadCount=5;
    static volatile int cnt=1;
    public printNumbersThread(int n){
        this.threadId=n;
    }
    @Override
    public void run(){
        synchronized(this.lock){
            while(cnt<101){
                if((cnt==threadId)||(cnt%threadCount==threadId)||(((cnt%threadCount==0) && (threadId==threadCount)))){
                    System.out.println("Thread "+this.threadId+" is printing "+cnt);
                    cnt++;
                    this.lock.notifyAll();
                }
                else{
                    try {
                        this.lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}

