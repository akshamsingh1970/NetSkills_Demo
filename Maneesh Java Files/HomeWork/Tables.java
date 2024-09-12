import java.util.Scanner;

class Tables
{	
	public static void printTables(Integer k){
		for(int i=2;i<=k;i++){
			System.out.println("Printing Table for "+i);
			for(int j=1;j<=10;j++){
				System.out.println(i+" x "+j+" = "+i*j);
			}
			System.out.println("-------------------");
		}
	}
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter number: ");
			int num = sc.nextInt();
			
			printTables(num);
		}
	}
}