/*
1)- Take an input string  like-
	String input = "Hello JavaTpoint";
	You need to write the program to reverse the String?
 */
import java.util.Scanner;
public class Q1
{
	public static void main(String[] args) {
	    Scanner newobj = new Scanner(System.in);
	    String input = newobj.nextLine();
	    String nstr = "";
	    for(int i = 0; i < input.length(); i++){
	        nstr += input.charAt(input.length()-1-i);
	    }
	    System.out.println(nstr);
	}
}