/*
5-> Write a program to print the division of Student marks based on percentage.
Like: Dictation, first division, second division, third division, fail.
Solve the program by if-else and switch statements.
*/
import java.util.Scanner;
public class Q5
{
	public static void main(String[] args) {
		 Scanner obj = new Scanner(System.in);
		 System.out.print("Please Enter the percentage: ");
		 float percentage = obj.nextFloat();
		 if(percentage >= 70.00 && percentage <= 100.00)    System.out.println("Distinction");
		 else if(percentage >= 60.00 && percentage < 70.00) System.out.println("First Division");
		 else if(percentage >= 40.00 && percentage < 60.00) System.out.println("Second Division");
		 else if(percentage >=0.00 && percentage < 40.00)   System.out.println("Fail");
		 else System.out.println("Invalid percentage");
		 int grade = (int)(percentage/10);
		 switch(grade){
			case 10: case 9: case 8: case 7:
				System.out.println("Distinction");
				break;
			case 6: 
				System.out.println("First Division");
				break;
			case 5: case 4: 
				System.out.println("Second Division");
				break;
			default:
				System.out.println("Fail");
		 }
	}
}