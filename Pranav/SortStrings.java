import java.util.*;

public class SortStrings {
    public static void main(String[] args){
        String[] input={"-100","50",".12","0.12","0","000.000"};
        sortStrings(input);


    }
    private static void sortStrings(String[] a){
//        HashMap<Float, List<String>> hashMap = new HashMap<>();
        int length=a.length;
//        for(int i=0;i<length;i++){
//            hashMap.put(Float.parseFloat(a[i]),a[i]);
//
//        }
        PriorityQueue<String> stringPriorityQueue= new PriorityQueue<>(new stringComparator());

        for(int i=0;i<length;i++){
            stringPriorityQueue.add(a[i]);
        }
        System.out.println("Sorted String Array: ");
        for(int i=0;i<length;i++){
            System.out.print(stringPriorityQueue.poll()+" ");
        }
        System.out.println();
    }
}