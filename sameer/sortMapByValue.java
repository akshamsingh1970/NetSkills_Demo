import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class sortMapByValue {
    public static void main(String[] args) {
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("Sameer", 1004);
        mapping.put("Pranav", 1002);
        mapping.put("Siva Sai", 1009);
        mapping.put("Reddy Anna", 1001);
        mapping.put("Yagnik Anna", 1006);

        Map<String, Integer> sortedMap = mapping.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue())
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        
        for(Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " | Value: " + entry.getValue());
        }
        
    }
}
