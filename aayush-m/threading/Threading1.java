
public class Threading1 {
    public static void main(String[] args) {
        try {
            for(int i = 1; i <20; i=i+5)  {
                MainThread m1 = new MainThread(i);
                Thread thread = new Thread(m1);
                thread.start();
                thread.join();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class MainThread implements Runnable {
    int i;
    MainThread (int i)  {
        this.i = i;
    }
    @Override
    public void run() {
        int k = i + 5;
        for(int j = i; j < k;j++ )
            System.out.println(j);
    }
}