/* 3-> Wirte a program to sort the given array in descending order. Your string value be the same during the output.
Like- .12 printed as .12 and 0.12 printed as 0.12
Ex-> String[] str = {"-100","50",".12","0.12","0","000.000"};
*/
public class Question3{
    public static void main(String[] args){
        String[] str = {"-100","50",".12","0.12","0","000.000"}; 
        try{
            float[][] arr = new float[6][2];
            for(int i = 0; i < 6; i++){ 
                arr[i][1] = i;
                arr[i][0] = Float.parseFloat(str[i]);
                //System.out.print(arr[i][0] + " " + arr[i][1] + ", ");
            }
            //System.out.println();
            for(int i = 0; i < 6; i++){
                for(int j = 0; j < 6; j++){
                    if(arr[i][0] > arr[j][0]){
                        float temp1 = arr[i][0],temp2 = arr[i][1];
                        arr[i][0] = arr[j][0];
                        arr[i][1] = arr[j][1];
                        arr[j][0] = temp1;
                        arr[j][1] = temp2;
                    }
                }
            }
            String str2[] = new String[6];
            for(int i = 0; i < 6; i++)  str2[i] = str[(int)arr[i][1]];
            for(int i = 0; i < 6; i++)  System.out.print(str2[i]+" ");
            System.out.println();
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
        
        System.out.println("Remaining code....");
    }
}