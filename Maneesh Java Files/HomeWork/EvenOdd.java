import java.util.Scanner;

class EvenOdd {
	public static void findEvenOdd(int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.println("number " + i + " is " + (i % 2 == 0 ? "even" : "odd"));
		}
	}

	public static void main(String[] args) throws java.lang.Exception {
		try (
				Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the start value:");
			int start = sc.nextInt();
			System.out.println("Enter the end value:");
			int end = sc.nextInt();
			findEvenOdd(start, end);
		}
	}
}