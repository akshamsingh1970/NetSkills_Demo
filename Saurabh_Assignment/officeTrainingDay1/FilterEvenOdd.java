import java.util.*;
import java.util.stream.*;

@FunctionalInterface
interface MyInterface {
    void solve();
}

class Main{
    public static void main(String args[]){
        MyInterface mi = ()->{
            List<Integer> list = new ArrayList<Integer>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);

            List<Integer> evens = list.stream().filter(num->num%2 == 0).collect(Collectors.toList());
            List<Integer> odds = list.stream().filter(num->num%2 != 0).collect(Collectors.toList());
            System.out.println("Evens: "+evens);
            System.out.println("Odds: "+odds);
        };

        mi.solve();
    }
}