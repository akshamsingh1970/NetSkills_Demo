public class q12 {
    public static void main(String[] args) {
        int[] arr={22,100,44,11,22,100,77,44,11};
        int firstNum=-100000000, secondNum=-10000000, thirdNum=-10000000;
        for(int i=0;i<9;i++){

            if(arr[i] >= firstNum){
                int temp1=firstNum;
                firstNum=arr[i];
                int temp=secondNum;
                secondNum=temp1;
                thirdNum=temp;
                
            }
            else if(arr[i] >= secondNum){
                int temp1=secondNum;
                secondNum=arr[i];
                thirdNum=temp1;
            }
            else if(arr[i] > thirdNum){
                thirdNum=arr[i];
            }
        }
        System.out.print(thirdNum);

    }
}
