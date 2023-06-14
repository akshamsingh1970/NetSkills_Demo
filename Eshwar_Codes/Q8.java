/*
8-> Write a program to print the given number is leap year or not. Where your 
	number is int year = 1990;
*/
import java.util.Scanner;
public class Q8
{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Year: ");
		int year = obj.nextInt();
		if((year%4 == 0 && year%100 != 0)||year%400 == 0)
		    System.out.println("Leap Year");
		else
		    System.out.println("Not Leap Year");
	}
}