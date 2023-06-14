
import java.util.Scanner;

public class exception {

     static void sizeCheck(int len) throws size13Exception{
        if(len == 13){
            throw new size13Exception();
        }
        else{
            System.out.println(len);
        }
    }    
    public static void main(String[] args) {

        // Scanner sc=new Scanner(System.in);
        // try{
        //     int a=sc.nextInt();
        //     int b=sc.nextInt();
        //     int res=a/b;
        //     System.out.print(res);
        // }
        // catch(Exception e){
        //     // System.out.print(e);
        //     e.printStackTrace();
        // }
        // finally{
        //     sc.close();
        // }
        // System.out.println("sdcf");
        Scanner sc2=new Scanner(System.in);
        try{
            String str=sc2.nextLine();
            sizeCheck(str.length());
        }
        catch(size13Exception e){
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            sc2.close();
        }
    }
}

class size13Exception extends Exception{
   public size13Exception(){
        super("size is exactly 13");
    }
}
