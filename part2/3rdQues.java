import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class exception {


    public static void main(String args[])
    {

        String arr[] = {"0.12","12","-100","50","0","000.000"};
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return Float.valueOf(a).compareTo(Float.valueOf(b));
            }
        });

       for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");

       int ar[] = new int[10];

       Scanner s = new Scanner(System.in);
       for(int i=0;i<10;i++)
       {
          ar[i] = s.nextInt();
       }
    }
}
