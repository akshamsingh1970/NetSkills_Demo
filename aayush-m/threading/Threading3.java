
public class Threading3 {
    public static void main(String[] args) {
        final PrintNumber P = new PrintNumber();
        Thread1 T1 = new Thread1(P);
        Thread2 T2 = new Thread2(P);
        Thread3 T3 = new Thread3(P);
        Thread4 T4 = new Thread4(P);
        Thread5 T5 = new Thread5(P); 

        T1.start();
        T2.start();
        T3.start();
        T4.start();
        T5.start();
    }
}
class Thread1 extends Thread    {
    PrintNumber P1;
    Thread1(PrintNumber P1) {
        this.P1 = P1;
    }
    @Override
    public void run() {
        super.run();
        System.out.print("Thread 1: ");
        P1.print(1);
    }
}

class Thread2 extends Thread    {
    PrintNumber P2;
    Thread2(PrintNumber P2) {
        this.P2 = P2;
    }
    @Override
    public void run() {
        super.run();
        System.out.print("Thread 2: ");
        P2.print(2);
    }
}

class Thread3 extends Thread    {
    PrintNumber P3;
    Thread3(PrintNumber P3) {
        this.P3 = P3;
    }
    @Override
    public void run() {
        super.run();
        System.out.print("Thread 3: ");
        P3.print(3);
    }
}

class Thread4 extends Thread    {
    PrintNumber P4;
    Thread4(PrintNumber P4) {
        this.P4 = P4;
    }
    @Override
    public void run() {
        super.run();
        System.out.print("Thread 4: ");
        P4.print(4);
    }
}

class Thread5 extends Thread    {
    PrintNumber P5;
    Thread5(PrintNumber P5) {
        this.P5 = P5;
    }
    @Override
    public void run() {
        super.run();
        System.out.print("Thread 5: ");
        P5.print(5);
    }
}

class PrintNumber   {
    synchronized void print(int num)  {
        for(int i = num; i <= 100; i=i+5) {
            System.out.print(i+" ");
            try {
                wait(300);
            }
            catch(Exception e)  {
                System.out.println(e);
            }
            finally {
                notifyAll();
            }
        }
    }
}