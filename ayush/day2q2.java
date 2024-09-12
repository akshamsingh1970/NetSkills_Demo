
public class day2q2 {
    public static void main(String[] args)
    {
        sum a=new sum();
        int x=a.divsum(69);
        System.out.println(x);
    }


}
interface  ABC
{
    public int divsum(int n);
}
class sum implements ABC{
//    private int n;
    int sum=0;
    public int divsum(int n)
    {
        sum=n;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        return sum;
    }
}