import java.util.*;

public class exception{
    public static void main(String[] args){

        Scanner myObj = new Scanner(System.in);

        try{
            int x= myObj.nextInt();
            int y = myObj.nextInt();
            int c = x/y;
            System.out.println(c);
        }
         catch(Exception e){
            System.out.println(e);
        }   
       
        
    }
}