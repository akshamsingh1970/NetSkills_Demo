import java.util.*;
public class exception1{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a;
        int b;

        try{
            a=sc.nextInt();
            b=sc.nextInt();
            int div=a/b;
            System.out.println("Division is :"+div);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}