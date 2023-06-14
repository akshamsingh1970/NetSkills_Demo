package NetSkills_Demo.vinay;

import java.util.*;

public class sortStringDescending {
    public static void main(String[] args) {
        String[] input = new String[] {"-100", "50", ".12", "0.12", "0", "000.000"};
        System.out.println("Given numbers (as strings):");
        for(String str: input)
            System.out.print(str + " ");
        Map<Float, List<String>> mapping = new HashMap<>();

        for(int i = 0; i < input.length; i++) {
            float num = Float.parseFloat(input[i]);
            if(mapping.get(num) != null)
                mapping.get(num).add(input[i]);
            else {
                List<String> list = new ArrayList<String>();
                list.add(input[i]);
                mapping.put(num, list);
            }
        }
        System.out.println("\n\nSorted numbers (as strings):");
        sortbykey(mapping);
        System.out.println("\n");

    }

    public static void sortbykey(Map<Float, List<String>> mapping) {
        // TreeMap to store values of HashMap
        TreeMap<Float, List<String>> sorted = new TreeMap<>(Collections.reverseOrder());

        // Copy all data from hashMap into TreeMap
        sorted.putAll(mapping);

        // Display the TreeMap which is naturally sorted
        for (Map.Entry<Float, List<String>> entry : sorted.entrySet())
            for(String ele: entry.getValue())
                System.out.print(ele + " ");
    }
}
