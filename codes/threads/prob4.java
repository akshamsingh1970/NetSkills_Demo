import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class NumberPrinter implements Runnable {
    private static final int MAX_COUNT = 50;
    private static final int THREAD_COUNT = 5;

    private static int currentNumber = 1;
    private static int currentThreadId = 1;

    private final int threadId;
    private final Lock lock;
    private final Condition condition;

    public NumberPrinter(int threadId, Lock lock, Condition condition) {
        this.threadId = threadId;
        this.lock = lock;
        this.condition = condition;
    }

    @Override
    public void run() {
        try {
            while (currentNumber <= MAX_COUNT) {
                lock.lock();
                try {
                    // Wait for it to be the thread's turn
                    while (currentThreadId != threadId) {
                        condition.await();
                    }

                    if (currentNumber <= MAX_COUNT) {
                        System.out.println("Thread " + threadId + ": " + currentNumber);
                        currentNumber++;

                        if (currentThreadId == THREAD_COUNT) {
                            currentThreadId = 1;
                        } else {
                            currentThreadId++;
                        }
                    }

                    // Notify the next thread
                    condition.signalAll();
                } finally {
                    lock.unlock();
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class prob4 {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        Thread[] threads = new Thread[5];

        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(new NumberPrinter(i + 1, lock, condition));
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
