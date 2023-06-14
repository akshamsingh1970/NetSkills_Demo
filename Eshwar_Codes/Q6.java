/*
6-> Write a program for factorial 8;
*/
import java.util.Scanner;
public class Q6
{
	public static void main(String[] args) {
		 Scanner obj = new Scanner(System.in);
		 System.out.print("Please Enter the Number: ");
		 int num = obj.nextInt();
		 long ans = 1;
		 for(int i = 1; i <= num; i++)   ans *= i;
		 System.out.println(num+ "! = " + ans );
	}
}
