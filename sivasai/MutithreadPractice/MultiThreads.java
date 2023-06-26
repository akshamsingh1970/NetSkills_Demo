import java.util.ArrayList;

public class MultiThreads {
    public static void main(String []args) throws InterruptedException {

        String myStr = "aabbbccddaaabbccceeff";
        int[] arr = {1,5,20};
        SubThread1 sth1 = new SubThread1(50);
        SubThread2 sth2 = new SubThread2(arr);
        SubThread3 sth3 = new SubThread3(myStr);
        sth1.start();
        sth2.start();
        sth3.start();
        sth1.join();

        int sumOfPrimes = sth1.getValue();
        System.out.println("Sum of primes from 1 to 50 is: "+sumOfPrimes);
        System.out.println();

    }
}

class SubThread1 extends Thread{
    private int limit;
    private int sumVal;

    public SubThread1(int num){
        this.limit = num;
        this.sumVal = 0;
    }

    public void run(){
        for(int i=2;i<=this.limit;i++){
            if(PrimeCheck(i)){
                this.sumVal+=i;
            }
        }
//        System.out.println(this.sumVal);
    }

    public int getValue(){
        return sumVal;
    }

    public Boolean PrimeCheck(int num){
        Boolean val = false;
        int sqrtI = (int)Math.sqrt((double)num);
        int divisors = 0;

        for(int j=1;j<=sqrtI;j++){
            if(num%j == 0){
                divisors+=1;
            }
        }
        if(divisors == 1){
            val = true;
        }
        return val;
    }
}

class SubThread2 extends Thread{
    private int[] array;
    private ArrayList<Integer> filledArray;
    public SubThread2(int[] arr){
        array = arr;
        filledArray = new ArrayList<Integer>();
    }
    public void run(){
        int length = array.length;
        for(int i=0;i<length;i++){
            if(i==0){
                continue;
            }
            else{
                int lastInt = array[i-1];
                for(int j=lastInt+1;j<array[i];j++){
                    this.filledArray.add(j);
                }
            }
        }
        System.out.println("Filled Array is: ");
        PrintArray(this.filledArray);
    }

    private void PrintArray(ArrayList<Integer> arrlst){
        int length = arrlst.size();
        for(int i=0;i<length;i++){
            System.out.print(arrlst.get(i)+" ");
        }
        System.out.println();
    }
}

class SubThread3 extends Thread{
    String str = "";

    public SubThread3(String temp){
        this.str = temp;
    }

    public void run(){
        String string = "";
        int length = str.length();
        int count = 0;
        for(int i=0;i<length;i++){
            if(string == ""){
                string+=str.charAt(i);
                count=1;
            }
            else if(str.charAt(i-1) == str.charAt(i)){
                count+=1;
            }
            else if(str.charAt(i-1) != str.charAt(i)){
                string+=count;
                string+=str.charAt(i);
                count=1;
            }
        }
        string+=count;
        System.out.println("Output: "+string);
    }

}