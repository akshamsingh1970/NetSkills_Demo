package NetSkills_Demo.codes.collections;
import java.util.Arrays;
import java.util.Comparator;

public class prob3 {
    public static void main(String[] args) {
        String[] arr = {"10", "2.5", "3", "7.8", "1.2","0.1",".1","-3.0"};

        // Sorting the array in reverse order
        Arrays.sort(arr, new ReverseNumericStringComparator());

        // Printing the sorted array
        for (String element : arr) {
            System.out.println(element);
        }
    }
}

class ReverseNumericStringComparator implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        double num1 = Double.parseDouble(str1);
        double num2 = Double.parseDouble(str2);

        return Double.compare(num2, num1); // Reversed comparison
    }
}
