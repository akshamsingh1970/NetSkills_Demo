package FunctionalInterfaceQues;

import java.util.LinkedHashSet;

public class q3 {
    public static void main(String[] args) {
        int [] list={12,34,22,12,43,34,22};

        duplicates dup=(int[] a)->{
            LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
 
            for (int i = 0; i < a.length; i++)
                set.add(a[i]);

            System.out.print(set);
        };

        dup.remove(list);
    }
}
interface duplicates{
    public void remove(int [] list);
}
