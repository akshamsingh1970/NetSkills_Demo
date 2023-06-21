import java.util.Scanner;

class StringReverse
{
	public static void reverseString(String str){
		String reversedString = "";
		for(int i=0;i<str.length();i++){
			reversedString = str.charAt(i) + reversedString;
		}
		System.out.println("Reversed String: "+ reversedString);
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a string:");
			String str = sc.nextLine();
			reverseString(str);
		}
	}
}