public class thirdHigh {
    public static void main(String [] args){

   int temp, size;
   int array[] = {22,100,44,11,22,100,77,44,11};
   size = array.length;

   for(int i = 0; i<size; i++ ){
      for(int j = i+1; j<size; j++){
         if(array[i]>array[j]){
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
         }
      }
   }
   System.out.println("Third largest number is:: "+array[size-3]);
   }
    }