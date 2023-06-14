public class thirdmax {
    public static void main(String[] args) {

        int max1 =0, max2 =0, max3 =0;
        int [] arr = {22, 100, 44, 11, 22, 100, 77, 44, 11};

        for (int i=0;i<arr.length;i++) {
            if (arr[i]>max1) {
                max3=max2;
                max2=max1;
                max1 = arr[i];
            }
            
            else if (arr[i]<max1 && arr[i]>max2) {
                max3=max2;
                max2=arr[i];
            }
            else if (arr[i]>max3) {
                max3=arr[i];
            }
        }
    System.out.println("Third maximum element is "+max3);
    }
}