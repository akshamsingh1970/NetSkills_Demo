import java.util.Arrays;
import java.util.List;

public class SmallestLargest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,6,7,3,5,7,3,6,8,9,3,3,5,1,2);
        int secondSmallest = list.stream().distinct().sorted().skip(1).findFirst().orElseThrow();
        System.out.println(secondSmallest);
        int secondLargest = list.stream().distinct().sorted((a,b)->b.compareTo(a)).skip(1).findFirst().orElseThrow();
        System.out.println(secondLargest);
    }
}
