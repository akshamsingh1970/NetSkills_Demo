import java.util.Scanner;

class Factorial {
	public static void getFactorial(int a) {
		int ans = 1;
		for (int i = 2; i <= a; i++) {
			ans *= i;
		}
		System.out.println("Factorial of "+a+" is "+ans);
	}

	public static void main(String[] args) throws java.lang.Exception {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number to find its factorial: ");
			int num = sc.nextInt();
			getFactorial(num);
		}
	}
}