import java.util.Scanner;
public class factorial
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int a=sc.nextInt();
		int p=1;
		for(int i=1; i<=a; i++)
		{
		    p=p*i;
		}
		System.out.print("Factorial of " +a);
		System.out.print("\n" );
		System.out.print(p);
		
		
	}
}
