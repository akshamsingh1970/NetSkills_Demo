import java.util.Scanner;
public class StringReverse
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		char[] str = sc.next().toCharArray();
		//System.out.println("enter string");
		int n = str.length-1;
		String newStr = "";
		for(int i=n;i>=0;i--){
		    newStr = newStr+String.valueOf(str[i]);
		}
		System.out.println("reversed string is ");
		
		    System.out.print(newStr);
	
		
	}
}
