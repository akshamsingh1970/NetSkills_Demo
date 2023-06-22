
import java.util.*;
class Main{
    public static void main(String args[]){
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Saurabh", 1);
        map.put("Yatish", 4);
        map.put("Sameer", 2);
        map.put("Ankit", 3);

        map.entrySet().stream().sorted((p1, p2)->{
            return Integer.compare(p1.getValue(), p2.getValue());   // expect return int not boolean
        }).forEach(System.out::println);      
    }
}