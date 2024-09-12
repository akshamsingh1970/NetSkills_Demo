import java.util.Arrays;
import java.util.Comparator;

public class sorting {
    public static void main(String[] args) {
        String[] arr = { "-100", "50", ".12", "0.13", "0", "000.000" };


        Arrays.sort(arr,new sortfloat());
        for (String i:arr){
            System.out.println(i);
        }
    }
}

class sortfloat implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return (Float.compare(Float.parseFloat(s1), Float.parseFloat(s2)))* -1;
    }
}