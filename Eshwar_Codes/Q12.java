/*
12-> Find out the 3rd max element from the array with a single loop.
int[] arr = {22,100,44,11,22,100,77,44,11};
*/
public class Q12{
    public static void main(String[] args){
        int[] arr = {22,100,44,11,22,100,77,44,11};
        int first_max,second_max,third_max;
        first_max = second_max = third_max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > first_max){
                third_max = second_max;
                second_max = first_max;
                first_max = arr[i];
            }
            else if(arr[i] != first_max && arr[i] > second_max){
                third_max = second_max;
                second_max = arr[i];
            }
            else if(arr[i] != second_max && arr[i] > third_max){
                third_max = arr[i];
            }
        }
        System.out.println(third_max);
    }
}