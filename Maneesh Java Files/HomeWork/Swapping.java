/* package whatever; // don't place package name! */



/* Name of the class has to be "Main" only if the class is public. */

import java.util.Scanner;

class Swapping
{
	public static void swapNumbers(int a, int b){
		System.out.println("Before swapping a and b : "+ a +" "+ b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping a and b : "+ a +" "+ b);
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter numbers: ");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
		
			swapNumbers(num1,num2);
		}
	}
}