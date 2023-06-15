public class sumOfDivisors implements divisionInterface {

    public static void main(String[] args)
    {
        sumOfDivisors s1 = new sumOfDivisors();
        System.out.println(s1.run(8));
    }
    @Override
    public int run(int n) {
        int sum=0;
        if(n>1000)
        {
            return 0;
        }

        else{
            for(int i=1;i<=n;i++)
            {
                if(n%i==0)
                {
                    sum+=i;
                }
            }
            return sum;
        }
    }
}
