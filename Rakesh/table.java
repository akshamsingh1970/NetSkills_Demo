import java.util.Scanner;

public class table {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
         for(int i=2; i<6; i++)
         {
             for(int j=1; j<=10; j++){
                 System.out.println(i+ "X" +j+ "=" +i*j);
             }
             System.out.print("\n");
         }
	}
}
