import java.util.ArrayList;

public class subClassesMT {
    public static void main(String[] args) throws InterruptedException {
        sumofPrimesMT tc1=new sumofPrimesMT(50);
        Thread t1=new Thread(tc1);

        stringCountCharMT tc2=new stringCountCharMT("aaabbcccd");
        Thread t2=new Thread(tc2);

        int[] array={1,5,20,30};
        fillArrayMT tc3=new fillArrayMT(array);
        Thread t3=new Thread(tc3);

        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
    }

}
class sumofPrimesMT implements Runnable{
    private int end;
    public int sum=0;
    public sumofPrimesMT(int end){
        this.end=end;
    }
    @Override
    public void run() {
        System.out.println("Sum of Primes Thread has STARTED!!!");
        System.out.println("Sum of Primes from 1-50 is: "+sumofPrimes(end));
        System.out.println("Sum of Primes Thread has ENDED!!!");
    }
    public int sumofPrimes(int end){
        for(int i=2; i<=end; i++ ){
            double condition=Math.sqrt(i);
            Boolean isComposite= false;
            for(int j=2; j<=condition;j++){
                if(i%j==0){
                    isComposite=true;
                }
            }
            if(!isComposite){
                sum+=i;
            }

        }
        return sum;
    }
}
class fillArrayMT implements Runnable{
    private int[] arr;
    public fillArrayMT(int[] arr){
        this.arr=arr;
    }
    @Override
    public void run() {
        System.out.println("Fill Missing Elements in Array Thread has STARTED!!!");
        fillArray(arr);
        System.out.println("Fill Missing Elements in Array Thread has ENDED!!!");
    }
    public void fillArray(int[] array){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int arrLength=array.length;
        ArrayList<Integer> current=new ArrayList<Integer>();
        for(int i=0; i<arrLength;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
            current.add(arr[i]);
        }
        for(int i=min;i<=max;i++){
            if(!current.contains(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
class stringCountCharMT implements Runnable{
    private String s;
    public String ans="";
    public stringCountCharMT(String s){
        this.s=s;
    }
    @Override
    public void run(){
        System.out.println("String Character Count Thread has STARTED!!!");
        System.out.println("Output String is: "+stringCountChar(s));
        System.out.println("String Character Count Thread has ENDED!!!");
    }
    public String stringCountChar(String s){
        int strLength=s.length();
        int cnt=0;
        for(int i=0;i<strLength;i++){
            if(i==0){
                continue;

            }
            else {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    cnt += 1;
                } else if(s.charAt(i) != s.charAt(i - 1)){
                    cnt++;
                    ans += s.charAt(i-1);
                    ans += cnt;
//                    System.out.println("ans: "+ans+", cnt: "+cnt+", i: "+i);
                    cnt = 0;
                }
            }
//            System.out.println("ans: "+ans+", cnt: "+cnt+", i: "+i+", char: "+s.charAt(i));
        }
        cnt++;
        ans+=s.charAt(strLength-1);
        ans+=cnt;
        return ans;
    }
}



