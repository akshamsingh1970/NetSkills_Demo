interface m
{   
    public int sum(int a);
}

public class Sumd implements m
{   
    public int sum(int x)
    {
        int s=0;
        for(int i=1;i<=x/2;i++)
        {
           if(x%i ==0)
           s+=i;
        }
        return s;
    }
    
    public static void main(String args[])
   {
    Sumd obj = new Sumd();
        int x=10;
        System.out.println(obj.sum(x));
        
   }
}