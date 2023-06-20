import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UpperLowerCase {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("quick");
        list.add("Brown");
        list.add("FOX");
        list.add("lazy");
        list.add("dOG");

        List<String> allLower = list.stream().map(x->x.toLowerCase()).collect(Collectors.toList());
        List<String> allUpper = list.stream().map(x->x.toUpperCase()).collect(Collectors.toList());

        for (String ele : allUpper) {
            System.out.print(ele+" ");
        }

        System.out.println();

        for (String ele : allLower) {
            System.out.print(ele+" ");
        }

    }    
}
