import java.util.Scanner;

class Grading2
{
	public static void findCategory(int marks){
		if(marks>=70){
			System.out.println("Distinction");
		}
		else if(marks>=60){
			System.out.println("First Class");
		}
		else if(marks>=50){
			System.out.println("Second Class");
		}
		else if(marks>=40){
			System.out.println("Third Class");
		}
		else if(marks>=35){
			System.out.println("Passed");
		}
		else{
			System.out.println("Failed");
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter marks to find its category: ");
			int num = sc.nextInt();
			findCategory(num);
		}
	}
}