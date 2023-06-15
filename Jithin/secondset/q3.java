package secondset;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class q3 {
    public static HashMap<String, Double> sortByValue(HashMap<String, Double> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Double> > list =
               new LinkedList<Map.Entry<String, Double> >(hm.entrySet());
 
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Double> >() {
            public int compare(Map.Entry<String, Double> o1,
                               Map.Entry<String, Double> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
         
        // put data from sorted list to hashmap
        HashMap<String, Double> temp = new LinkedHashMap<String, Double>();
        for (Map.Entry<String, Double> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
    public static void main(String[] args) {

        String[] str= {"-100","50",".12","0.12","0","000.000"};
        HashMap<String,Double> h=new HashMap<String,Double>();
        
        
        Double[] nums=new Double[str.length];

        for(int i=0;i<str.length;i++){
            h.put(str[i],Double.parseDouble(str[i]));
            nums[i]=Double.parseDouble(str[i]);
        }
       Map<String, Double> hm1 = sortByValue(h);
 
        // print the sorted hashmap
        for (Map.Entry<String, Double> en : hm1.entrySet()) {
            System.out.println(en.getKey());
        }
             
    }

}

