package NetSkills_Demo.codes.threads;

public class print20 {
    public static void main(String[] args) {
            newThread t11 = new newThread(1, 5);
            newThread t22 = new newThread(6, 10);
            newThread t33 = new newThread(11, 15);
            newThread t44 = new newThread(16, 20);

            Thread t1 = new Thread(t11,"T1");
            Thread t2 = new Thread(t22,"T2");
            Thread t3 = new Thread(t33,"T3");
            Thread t4 = new Thread(t44,"T4");

            t1.start();
            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            t2.start();
            try {
                t2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            t3.start();
            try {
                t3.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            t4.start();
            try {
                t4.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
}

class newThread implements Runnable {
    int s,e;
     
    newThread(int s, int e) {
        this.s = s;
        this.e = e;
    }

    public void run() {
        for (int i = s; i <= e; i++) {
            System.out.println(i);
        }
    }
}