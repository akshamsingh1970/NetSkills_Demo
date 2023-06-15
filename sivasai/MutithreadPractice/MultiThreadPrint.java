public class MultiThreadPrint {

    public static void main(String []args) throws InterruptedException {
        int numOfThreads = 5;
        int limit = 100;

        PrintValues[] prtThreads = new PrintValues[numOfThreads];
        for (int i = 0; i < numOfThreads; i++){
            prtThreads[i] = new PrintValues(i+1, numOfThreads);
            prtThreads[i].start();
        }
//        Thread.sleep(2000);
        System.out.println();

        for(int i=0;i<numOfThreads;i++){
            prtThreads[i].join();
        }
    }
}


class PrintValues extends Thread {
    private int id;
    private int totalThreads;

    static volatile int value = 1;

    public PrintValues(int num, int total) {
        id = num;
        totalThreads = total;
    }

    public void run() {
        synchronized (this) {
            while (value != 101) {
                if (value == id || (value % totalThreads == id) ||
                        ((value % totalThreads == 0) && (totalThreads == id))) {
                    System.out.println("Thread-" + id + ": " + value);
                    value += 1;
                }
//            System.out.println();
            }
        }
    }
}