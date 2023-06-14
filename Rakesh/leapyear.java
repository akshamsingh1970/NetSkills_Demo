import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the Year");
	    int n=sc.nextInt();
	    if(n%4==0 || n%400==0)
	    System.out.println("Leap Year");
	    else
	    System.out.println("Non Leap Year");
	}
}
