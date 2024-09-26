public class findThirdMax {
    public static void main(String[] args) {
        int[] arr = new int[] {22, 100, 44, 11, 22, 100, 77, 44, 11};
        int high1 = -3;
        int high2 = -2;
        int high3 = -1;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] >= high1) {
                high3 = high2;
                high2 = high1;
                high1 = arr[i];
            }
            else if(arr[i] >= high2) {
                high3 = high2;
                high2 = arr[i]; 
            }
            else if(arr[i] >= high3)
                high3 = arr[i];
        }

        System.out.println("Third highest number is: " + high3);
    }
}
