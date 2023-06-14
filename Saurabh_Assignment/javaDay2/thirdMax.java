// 12-> Find out the 3rd max element from the array with a single loop. int[] arr = {22,100,44,11,22,100,77,44,11};

class thirdMax{
    public static void main(String[] args){
        int[] arr = {22,100,44,11,22,100,77,44,11};
        System.out.println("Third max: "+solve(arr));
    }

    public static int solve(int[] arr){
        int max1, max2, max3;
        max1 = max2 = max3 = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(max1 <= arr[i]){
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            }else if(max2 <= arr[i]){
                max3 = max2;
                max2 = arr[i];
            }else if(max3 <= arr[i]){
                max3 = arr[i];
            }else{
                continue;
            }
        }

        return max3;
    }
}