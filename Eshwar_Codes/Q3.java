/*
3-> Write a program to print the table of 2 to 5 numbers.
*/
public class Q3
{
	public static void main(String[] args) {
	    for(int i = 2; i <= 5; i++){
	        for(int j = 1; j <= 10; j++){
	            System.out.println(i + "x" + j + "=" + i*j);
	        }
	        System.out.println();
	    }
	    
	}
}