package HomeWork3;
import java.util.*;

public class Sort {
    public static void sorting(ArrayList<String> nums) {
        int len = nums.size();
        for (int i = 0; i < len - 1; i++) {
            int min_ind = i;
            String minStr = nums.get(i);
            for (int j = i + 1; j < len; j++) {
                if (Float.parseFloat(nums.get(j)) > Float.parseFloat(minStr)) {
                    minStr = nums.get(j);
                    min_ind = j;
                }
            }
            if (min_ind != i) {
                String temp = nums.get(min_ind);
                nums.set(min_ind, nums.get(i));
                nums.set(i, temp);
            }
        }
    }

    public static void printArray(ArrayList<String> nums) {

        nums.forEach((num) -> System.out.print(num + " "));

        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<String> nums = new ArrayList<String>();
        System.out.print("Enter the number of elements:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // consuming the <enter> from input above
        System.out.print("Start entering inputs\n");
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            nums.add(str);
        }
        sc.close();
        // String nums[] = { "100", "-100", "00000.2222", "22", ".12", "0.12" };
        printArray(nums);
        sorting(nums);
        printArray(nums);
    }
}
