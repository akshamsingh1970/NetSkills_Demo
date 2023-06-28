import java.util.HashMap;
import java.util.Map;

public class SortMap {
    private Map<Integer,String> map;
    public static void main(String[] args){
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"Gundugopal");
        map.put(2,"Yagnik");
        map.put(3,"Reddy Anna");
        map.put(4,"Sudeep");
        map.put(5,"Ved Vade");
        System.out.println("Sorted Map By Value: ");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }
}