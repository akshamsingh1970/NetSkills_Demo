// Java Program to print the multiplication table of
// number N using while loop

class table {
	public static void main(String[] args)
	{
		// number n for which we have to print the
		// multiplication table.
		int N = 7;

		int range = 10;

		// looping from 1 to range to print the
		// multiplication table of the number.
		int i = 1;

		// using while loop
		while (i <= range) {

			// printing the N*i,ie ith multiple of N.
			System.out.println(N + " * " + i + " = "
							+ N * i);
			i++;
		}
	}
}
