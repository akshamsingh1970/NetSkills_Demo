class factorial
{
// method to find factorial of given number
static int factorials(int n)
{
if (n == 0)
return 1;

return n*factorials(n-1);
}

// Driver method
public static void main(String[] args)
{
int num = 8;
System.out.println("Factorial of "+ num + " is " + factorials(8));
}
}