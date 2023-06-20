import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,1,5,1,2,2,3,3,3,4,5,4,6,6,6,6,7,4,6,7,3,6,7,8,5);
        List<Integer> unique = num.stream().distinct().collect(Collectors.toList());
        for (int ele : unique) {
            System.out.print(ele+" ");
        }
    }
}
