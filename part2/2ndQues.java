interface first{

    int find_div_sum(int x);
}
public class inf implements first {

    public int find_div_sum(int x)
    {
        int sum=0;
        for(int i=1;i<=x;i++)if(x%i == 0)sum+=i;
        return sum;
    }

    public static void main(String args[])
    {
       inf obj = new inf();
        System.out.println(obj.find_div_sum(3));
    }

}
