import java.util.Scanner;
public class thirdMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0,n;
        System.out.println("Enter size of array");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements of array");
        for(i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int thirdMax = findThirdMax(arr);
        System.out.println("Third maximum element: " + thirdMax);
    }

    public static int findThirdMax(int[] arr) {
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;

        for (Integer num : arr) {
            if (num.equals(max1) || num.equals(max2) || num.equals(max3)) {
                continue;
            }

            if (max1 == null || num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (max2 == null || num > max2) {
                max3 = max2;
                 max2 = num;
            } else if (max3 == null || num > max3) {
                max3 = num;
            }
        }

        return (max3 != null) ? max3 : max1;
    }
}