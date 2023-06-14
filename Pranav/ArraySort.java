public class ArraySort {
    public static void main(String[] args){
        int[] arr={22,100,44,11,22,100,77,44,11};
        System.out.println("The 3rd Max value in arr is: "+thirdMax(arr));
    }
    private static int thirdMax(int[] arr){
        int max3=Integer.MIN_VALUE;
        int max2=max3;
        int max1=max2;
        int arrLength= arr.length;
        for(int i=0;i<arrLength;i++) {
            if(arr[i]>max1){
                max3=max2;
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2){
                max3=max2;
                max2=arr[i];
            }
            else if(arr[i]>max3){
                max3=arr[i];
            }
        }
        return max3;
    }
}