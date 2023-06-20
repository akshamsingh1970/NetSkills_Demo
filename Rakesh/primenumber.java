import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number between 1 to 20");
	    int n=sc.nextInt();
	    int n1=0;
	    
	   if(n>20)
	   System.out.print("Invalid Number");
	   else{
	       for(int i=2; i<n; i++)
	       {
	           if(n%i==0){
	                n1++;
	           }
	          
	           }
	           if(n1==0)
	           System.out.print("Prime");
	           else
	           System.out.print("Not Prime");
	       }
	   }

}
