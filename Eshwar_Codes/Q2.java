/*
2->Write a program to print the prime number between 1 to 20.
*/
public class Q2
{
	public static void main(String[] args) {
	    boolean prime;
        for(int i = 3; i < 20; i++)
        {
            prime = true;
            for(int j = 2; j < i; j++)
            {
                if(i%j == 0)
                {
                    prime = false;
                    break;
                }
            }
            if(prime)
            {
                System.out.print(i+" ");
            }
        }
	}
}