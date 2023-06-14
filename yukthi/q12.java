public class q12 {

    public static void main(String[] args) {

        int[] arr={22,100,44,11,22,100,77,44,11};

        int first_num=-10000000, second=-10000000, third=-10000000;

        for(int i=0;i<9;i++){

            if(arr[i] >= first_num){

                int temp1=first_num;

                first_num=arr[i];

                int temp=second;

                second=temp1;

                third=temp;

                

            }

            else if(arr[i] >= second){

                int temp1=second;

                second=arr[i];

                third=temp1;

            }

            else if(arr[i] > third){

                third=arr[i];

            }

        }

        System.out.print(third);




    }

}