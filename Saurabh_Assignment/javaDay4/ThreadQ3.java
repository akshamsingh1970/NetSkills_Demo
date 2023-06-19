/*
print 1-100 using 5 threads like 
thread 1: 1 
thread 2: 2 
thread 3: 3 
thread 4: 4 
thread 5: 5 
thread 1: 6 
.
.
............
 */


   
class NumberPrinter implements Runnable {
    private static final Object lock = new Object();
    private static int number = 0;
    private final int threadId;

    public NumberPrinter(int threadId) {
        this.threadId = threadId;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if (number > 99) {  // because we are incrementing and then printing
                    break;
                }

                if (threadId == (number % 5)+1) {
                    number++;
                    System.out.println("Thread " + threadId + ": " + number);

                    if(number%5 == 0){
                        System.out.println("-----------------");
                    }

                    lock.notifyAll();
                } else {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

class ThreadQ3 {
    public static void main(String[] args) {
        Thread[] threads = new Thread[5];

        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(new NumberPrinter(i + 1));
            threads[i].start();
        }

        for (int i = 0; i < 5; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
                // System.out.println("here");
            }
        }
    }
}

