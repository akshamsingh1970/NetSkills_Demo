import java.util.Scanner;

class LeapYear
{
	public static void isLeapYear (int year){
		if(year % 400 == 0){
			System.out.println("The given year is a leap year.");
		}
		else if(year % 100 == 0){
			System.out.println("The given year is not a leap year.");
		}
		else if(year % 4 == 0){
			System.out.println("The given year is a leap year.");
		}
		else{
			System.out.println("The given year is not a leap year.");
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter year: ");
			int num = sc.nextInt();
			isLeapYear(num);
		}
	}
}