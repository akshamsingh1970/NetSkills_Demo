package NetSkills_Demo.codes.threads;

import java.util.ArrayList;

public class class3 {
    public static void main(String[] args){
        Thread1 t11 = new Thread1();
        Thread2 t22 = new Thread2();
        Thread3 t33 = new Thread3("aaaavcc");

        Thread t1= new Thread(t11,"T1");
        Thread t2= new Thread(t22,"T2");
        Thread t3= new Thread(t33,"T3");
    
        t1.start();
        try{
            t1.join();}
        catch(InterruptedException e){
            e.printStackTrace();
        }
        t2.start();
        try{
            t2.join();
        } 
        catch(InterruptedException e) {
        e.printStackTrace();}
        
        t3.start();

    }
}

class Thread1 implements Runnable {

    public void run() {
        int count ,sum=0;
        for (int i = 1; i <= 50; i++) {
            count=0;
            for (int j=2;j<=i/2;j++) {
                if (i%j==0){
                    count++;
                    break;
                }
            }
            if(count == 0 && i != 1 )
		    {
		    	sum = sum + i;
		    }  
		}
        System.out.println("\n The Sum of Prime Numbers from 1 to 100 = " + sum);
    }
}

class Thread2 implements Runnable {


    public void run() {
        int[] arr=new int[] {5,4,3,2,45,33,22,23,25,26,28,29,30,35};
        ArrayList<Integer>res = new ArrayList<Integer>(100);
        int k=1;
        for ( int i=1;i<50;i++) {
            boolean flag=false;
            for (int j :arr) {
                if (i==j) {
                    flag=true;
                }
            }
            if (!flag) {
                res.add(i);
            }
        }

        for(int var:res) {
            System.out.println(var);
        }
    }
}

class Thread3 implements Runnable {

    String s;
    Thread3(String s){
        this.s = s;
    }

    public void run() {
        int num = s.length(); //calculating length of the string
        int i=0; 
        while ( i < num) {
    
            // Counting the repetitions of each character 
            int repetition = 1;
            while ( i < num-1 && s.charAt(i) == s.charAt(i+1)) {
                repetition++;
                i++;
            }
            
            // Print character and its count
            System.out.println(s.charAt(i) + " " + repetition);
            i++;
        }
    }
}
