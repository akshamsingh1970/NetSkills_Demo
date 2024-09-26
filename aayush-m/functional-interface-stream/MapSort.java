import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSort {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 23);
        map.put("Banana", 1);
        map.put("Orange", 50);
        map.put("Pineapple", 45);

        HashMap<String, Integer> sortedMap = new HashMap<>();
        sortedMap = map.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue())
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)->e1,LinkedHashMap::new));


        for(String key: sortedMap.keySet())   {
            System.out.println(key+" "+sortedMap.get(key));
        }
    }
}
