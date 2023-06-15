public class prob12 {
    public static void main(String[] args) {
        int[] arr = { 22, 100, 44, 11, 22, 100, 77, 44, 11 };
        int max1 = arr[0], max2 = arr[1], max3 = arr[2];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max3 = max2;
                max2 = arr[i];
            } else if (arr[i] > max3) {
                max3 = arr[i];
            }
        }
        System.out.println(max3);
    }
}
