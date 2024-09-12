import java.util.Scanner;

public class p1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();

		sc.close();

		char[] ch = str.toCharArray();

		// Reverse the character array
		int start = 0;
		int end = ch.length - 1;
		while (start < end) {
			char temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;
			start++;
			end--;
		}

		String reversedStr = new String(ch);

		System.out.println("Reversed string: " + reversedStr);
	}
}
