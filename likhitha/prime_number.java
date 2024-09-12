class prime_number {
    public static void main(String[] arg){
        System.out.println("Prime numbers between 2 and 20 are ");
        for(int i=2;i<=20;i++)
        {
            if(fact(i)==2)
            System.out.print(" "+i+" ");
        }
    }
    static int fact(int n)
    {
        int x=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            ++x;
        }
        return x;
    }
}