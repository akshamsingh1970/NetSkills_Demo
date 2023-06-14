/*
7-> Write a program to swap the a and b numbers. Where int a = 5; int b = 10;
*/
import java.util.Scanner;
public class Q7
{
	public static void main(String[] args) {
		 Scanner obj = new Scanner(System.in);
		 System.out.print("a: ");
		 int a = obj.nextInt(); 
		 System.out.print("b: ");
		 int b = obj.nextInt();
		 a = a^b;
		 b = a^b;
		 a = a^b;
		 System.out.print("a: " + a +"\n");
		 System.out.print("b: " + b);
	}
}