import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEven {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(34,55,23,57,47,994,324,66,235,775,99,14);
        List<Integer> evenIntegers = num.stream().filter(n->n%2==0).collect(Collectors.toList());
        List<Integer> oddIntegers = num.stream().filter(n->n%2!=0).collect(Collectors.toList());
        for (int ele : oddIntegers) {
            System.out.print(ele+" ");
        }
        System.out.println();
        for(int ele: evenIntegers)  {
            System.out.print(ele+" ");
        }
    }
}
