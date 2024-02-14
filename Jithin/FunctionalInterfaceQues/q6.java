package FunctionalInterfaceQues;

import java.util.Arrays;

public class q6 {
    public static void main(String[] args) {
        int[] list={12,34,342,1,45,44,13}; // 1 12 13 34 44 45 342
        secondLargestAndSmallest obj=(int[] numList)->{
            Arrays.sort(numList);
            int n=numList.length;
            if(n<2){
                System.out.println("Not a valid array");
            }
            System.out.println("secondSmallest = " +numList[1] +"\nsecondLargest = "+numList[n-2]);
        };
        obj.fun(list);   
    }
}

interface secondLargestAndSmallest{
    public void fun(int []list);
}
