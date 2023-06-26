public class Main {
    public static void main(String[] args) throws InterruptedException {
        int numberOfThreads = 4;
        ThreadMethod[] th = new ThreadMethod[4];

        for(int i=0;i<numberOfThreads;i++){
            System.out.println("Thread-"+i+" started.");
            th[i] = new ThreadMethod(i*5+1,(i+1)*5);
            th[i].start();
            th[i].join();
        }

    }
}

class ThreadMethod extends Thread {
    private int num1;
    private int num2;
    public ThreadMethod(int a, int b){
        this.num1 = a;
        this.num2 = b;
    }
    public void run() {

        for (int i = num1; i <= num2; i++) {
            System.out.println(i);
        }
        System.out.println();
    }
}