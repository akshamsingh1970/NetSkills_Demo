public class pant{
    public static void main(String [] args){
        
         int i,j=0;
  
        
        for (i = 0; i < 9; i++) {
  
         
            for (j = i; j < 5; j++)
                System.out.print("*");
  
           
            for (j = 0; j < 2 * i + 1; j++)
                System.out.print(" ");
  
           
            for (j = i; j < 5; j++)
                System.out.print("*");
  
            System.out.println();
        }
    }
}