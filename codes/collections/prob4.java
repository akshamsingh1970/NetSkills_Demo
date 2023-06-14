package NetSkills_Demo.codes.collections;
import java.util.Scanner;

public class prob4 {
    public static void main(String[] args) throws Exception {
        

        try {
            int a,b;
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();
            b = scanner.nextInt();
            int res=a/b;
        } 
        catch(Exception e)  
        {  
             // resolving the exception in catch block  
            System.out.println("invalid type of variables to add");  
        }  
    }
}
