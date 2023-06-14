import java.util.Scanner;
public class reversestring
{
	public static void main(String[] args) {
	
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Input String");
	    String str=sc.nextLine();
	    String rev="";
	    char ch;
	    for(int i=0; i<str.length(); i++)
	    {
	        ch=str.charAt(i);
	        rev=ch+rev;
	    }
	   System.out.print("Reverse String is "+rev);
	}
}