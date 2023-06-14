import java.util.PriorityQueue;

public class javaAssignment2 {

    public static void main(String []args){
        DiamondPattern();
        System.out.println();
        PantsPattern();
        System.out.println();
        ReversePantsPattern();
        System.out.println();
        int[] array = {22,100,44,11,22,100,77,44,11};
//        int thirdMaxElem = ThirdMaxElement(array);
        int thirdMaxElem = ThirdMaxElem(array);
        printArray(array);
        System.out.println("Third maximum element in the given array is: "+thirdMaxElem);
    }

    public static void DiamondPattern(){
        int num = 6;
        String str1 = " ";
        String str2 = "* ";
        for(int i=1;i<=num;i++){
            System.out.print(str1.repeat(num-i));
            System.out.print(str2.repeat(i));
            System.out.print(str1.repeat(num-i)+"\n");
        }

        for(int i=num-1;i>=1;i--){
            System.out.print(str1.repeat(num-i));
            System.out.print(str2.repeat(i));
            System.out.print(str1.repeat(num-i)+"\n");
        }
    }

    public static void PantsPattern(){
        int num = 4;
//        int flag = 1;
        String str1 = "*";
        String str2 = " ";
        System.out.println(str1.repeat(2*num + 1));
        for(int i=num;i>=1;i--){
            System.out.print(str1.repeat(i));
            System.out.print(str2.repeat(num - i));
            System.out.print(str2.repeat(num+1 - i));
            System.out.print(str1.repeat(i)+"\n");
        }
    }

    public static void ReversePantsPattern(){
        int num = 4;
//        int flag = 1;
        String str1 = "*";
        String str2 = " ";

        for(int i=1;i<=num;i++){
            System.out.print(str1.repeat(i));
            System.out.print(str2.repeat(num - i));
            System.out.print(str2.repeat(num+1 - i));
            System.out.print(str1.repeat(i)+"\n");
        }
        System.out.println(str1.repeat(2*num + 1));
    }

    public static int ThirdMaxElement(int[] arr){
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        int len = arr.length;
        int k = 3;
        for(int i=0;i<len;i++){
            queue.add(arr[i]);
            if(queue.size()>k){
                queue.poll();
            }
        }
        return queue.peek();
    }

    public static int ThirdMaxElem(int[] arr){
        int max1 = 0;
        int max2 = 0;
        int max3 = 0;
        int len = arr.length;
        for(int i=0;i<len;i++){
            if(arr[i]>max1){
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i]>max2){
                max3 = max2;
                max2 = arr[i];
            }
            else if(max3<arr[i]){
                max3 = arr[i];
            }
        }
        return max3;
    }

    public static void printArray(int[] arr){
        System.out.println("Given array is: ");
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

