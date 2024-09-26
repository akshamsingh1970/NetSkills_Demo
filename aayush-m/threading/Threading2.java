import java.util.HashMap;

public class Threading2 {
    public static void main(String[] args) {
        Main m1 = new FirstThread();
        Main m2 = new SecondThread();
        Main m3 = new ThirdThread();
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);
        Thread t3 = new Thread(m3);
        try {
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Main implements Runnable{

    @Override
    public void run() {
    }
    
}

class FirstThread extends Main{
    @Override
    public void run() {
        super.run();
        System.out.println("First Thread:");
        for(int i = 2; i <= 50; i++ )   {
            int count = 0;
            for(int j = 1; j <= i; j++) {
                count += (i%j==0)? 1:0;
            }
            if(count == 2)
                System.out.print(i+" ");
        }
        System.out.println();
    }
}

class SecondThread extends Main   {
    public void run() {
        System.out.println("Second Thread: ");
        int[] input = {42,50,12,30,23,14,35,22,19,6,2,4,20,10,16,8,36,13,17,47};
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int i = 1; i <= 50; i++)    {
            map.put(i, false);
        }
        for(int i = 0; i < input.length; i++)   {
            if(map.containsKey(input[i]));
                map.put(input[i], true);
        }
        for(int i = 1; i <= 50; i++)    {
            if(!map.get(i))  {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}

class ThirdThread extends Main {
    @Override
    public void run() {
        super.run();
        System.out.println("Third Thread: ");
        String s1 = "aabbbccddaaabbccceeff";
        String result = "";
        int count = 1;
        for(int i = 0; i < s1.length()-1; i++)    {
            if(s1.charAt(i) == s1.charAt(i+1))  {
                count++;
            }
            else    {
                result += s1.charAt(i);
                result += count;
                count = 1;
            }
        }
        System.out.println(result);
    }
}