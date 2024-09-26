import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Quick", "Brown", "Fox", "Jumps", "Over", "Lazyy", "Dog");
        List<Integer> countList = list.stream().map(s->s.length()).collect(Collectors.toList());
        for(int ele: countList)
            System.out.println(ele);
    }
}
