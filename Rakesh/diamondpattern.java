public class diamondpattern {
    public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
		    for(int j=1; j<10; j++)
		    {
		        if(j>5-i && j<3+i)
		        System.out.print("*");
		        else
		        System.out.print(" ");
		    }
		    System.out.print("\n");
		}
		
		for(int i=1; i<=4; i++)
		{
		    for(int j=1; j<8; j++)
		    {
		        if(j>=1+i && j<=7-i)
		        System.out.print("*");
		        else
		        System.out.print(" ");
		    }
		    System.out.print("\n");
		}
	}

}
