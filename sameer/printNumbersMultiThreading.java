public class printNumbersMultiThreading {
    public static void main(String[] args) {
        int threadCount = 5;
        Object lock = new Object();
        Thread[] threads = new Thread[threadCount];

        for(int i = 0; i < threadCount; i++) {
            threads[i] = new Thread(new NumberPrinter(i+1, threadCount, lock));
            threads[i].start();
        }

        for(Thread thread : threads) {
            try {
                thread.join();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class NumberPrinter implements Runnable {
    private static volatile int number = 1;
    private int MAX_NUMBER = 100;
    private int threadId;
    private int threadCount;
    private Object lock;

    public NumberPrinter(int tId, int tCount, Object lo) {
        threadId = tId;
        threadCount = tCount;
        lock = lo;
    }

    @Override
    public void run() {
        synchronized(lock) {
            while(number <= MAX_NUMBER) {
                if(number % threadCount == threadId || (number % threadCount == 0) && (threadId == threadCount)) {
                    System.out.println("Thread: " + threadId + ", number: " + number);
                    number += 1;

                    lock.notifyAll();
                }
                else {
                    try {
                        lock.wait();
                    } 
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
