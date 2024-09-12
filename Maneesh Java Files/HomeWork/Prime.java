/* package whatever; // don't place package name! */

/* Name of the class has to be "Main" only if the class is public. */

import java.util.Scanner;

class Prime {
	public static void getPrimes(int a, int b) {
		for (int i = a; i <= b; i++) {
			Boolean isPrime = true;
			for (int j = 2; j * j <= i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) throws java.lang.Exception {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter start value: ");
			int num1 = sc.nextInt();
			System.out.println("Enter end value: ");
			int num2 = sc.nextInt();
			getPrimes(num1, num2);
		}
	}
}