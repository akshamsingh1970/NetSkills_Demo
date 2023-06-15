public class as24 {
    public static void main(String [] args) {


        int temp, size;

        int array[] = {22, 100, 44, 11, 22, 100, 77, 44, 11};

        size = array.length;
        int val3=Integer.MIN_VALUE;
        int val2=Integer.MIN_VALUE;
        int val1=Integer.MIN_VALUE;
        val1=array[0];
        for(int i=1;i<3;i++)
        {
            if(val3==Integer.MIN_VALUE && val1>=array[i])
            {
                val2=array[i];
            }
            else if(val3==Integer.MIN_VALUE && val1<array[i])
            {
                val2=val1;
                val1=array[i];
            }
            else if(val2>=array[i])
            {
                val3=array[i];
            }
            else {
                val3=val2;
                val2=array[i];
            }
        }
        for(int i=3;i<size;i++)
        {
            if(val1<=array[i])
            {
                val3=val2;
                val2=val1;
                val1=array[i];
            }
            else if(val2<=array[i])
            {
                val3=val2;
                val2=array[i];
            }
            else if (val3<=array[i])
            {
                val3=array[i];
            }
        }
        System.out.println(val3);


    }

}

