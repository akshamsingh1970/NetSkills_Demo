import java.util.*;

public class SortString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of String arrray ");
        int n= s.nextInt();
        String st[]=new String [n];
        for(int i=0;i<n;i++)
        st[i]=s.next();
        Arrays.sort(st, new Comparator<String>() {
            public int compare( String s1, String s2){
                double d1 = Double.parseDouble(s1);
                double d2 = Double.parseDouble(s2);
                return Double.compare(d2, d1);
            }
        }
        );
        for(int i=0;i<n;i++)
        System.out.print(" "+st[i]);
    }
}
