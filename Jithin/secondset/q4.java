package wednesday;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=a/b;
            System.out.println(c);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            sc.close();
        }
        

    }
}
