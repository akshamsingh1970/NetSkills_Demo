import java.util.Scanner;
class student
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The Five Subject Marks :");
		int m1 = input.nextInt();
		int m2 = input.nextInt();
		int m3 = input.nextInt();
		int m4 = input.nextInt();
		int m5 = input.nextInt();
		int tot = m1+m2+m3+m4+m5;
		float per = tot/5;
		System.out.println("Total :"+tot);
		System.out.println("Percentage :"+per);	
		if(per>=60)
		{			
			System.out.println("First Division.");
		}
		else if(per>=50 && per<=59)
		{			
			System.out.println("Second Division.");
		}
		else if(per>=40 && per<=49)
		{			
			System.out.println("Third  Division.");
		}
		else
		{			
			System.out.println("Fail.");
		}
	}
}