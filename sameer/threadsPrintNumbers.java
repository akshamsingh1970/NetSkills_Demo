public class threadsPrintNumbers {
    public static void main(String[] args) {
        Thread th1 = new Thread(new printer(1, 1));
        Thread th2 = new Thread(new printer(2, 6));
        Thread th3 = new Thread(new printer(3, 11));
        Thread th4 = new Thread(new printer(4, 16));
        
        th1.start();
        try {
            th1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        th2.start();
        try {
            th2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        th3.start();
        try {
            th3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        th4.start();
        try {
            th4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class printer implements Runnable {
    private int threadId;
    private int start;
   
    printer(int tId, int n) {
        threadId = tId;
        start = n;
        System.out.println("Creating thread with starting number " + start);
    }
   
    @Override
    public void run() {
        try {
            for(int i = start; i < start + 5; i++) {
                System.out.println("Thread: " + threadId + ", number: " + i);
            }
        } 
        catch (Exception e) {
            System.out.println("Thread " +  threadId + " interrupted.");
        }
        System.out.println("Thread " +  threadId + " exiting.");
    }
}
