import java.util.*;
public class p4   {
    public static void main(String[] args) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for(int i = 1; i <= 20; i++)    {
            if(i%2 == 0)    
                even.add(i);
            else
                odd.add(i);
        }

        System.out.print("List of odd numbers are: ");
        for(int i: odd)
            System.out.print(i+" ");
        System.out.println();
        System.out.print("List of even numbers are: ");
        for(int i: even)
            System.out.print(i+" ");
    }
}