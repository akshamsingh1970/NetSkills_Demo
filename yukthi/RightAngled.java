class RightAngled
{
    public static void main(String[] args)
    {
        System.out.println("\nRightAngled Traingle");
        for(int i=0;i<5;i++)
        {
           for(int j=0;j<5;j++)
            {
                if(i>=j)
                {

                    System.out.print("* ");
                }
            }
            System.out.println();

        }

        System.out.println("\nReverse RightAngled Traingle");
        for(int i=0;i<5;i++)
        {
           for(int j=0;j<5;j++)
            {
                if(i<=j)
                {

                    System.out.print("* ");
                }
            }
            System.out.println();

        }

    }
}

