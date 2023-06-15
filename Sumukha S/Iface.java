import java.util.Scanner;
interface A{
    public int sumofdivisors(int n);
}

class Iface implements A{
    public int sumofdivisors(int n){
        int result = 0;
      
        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            
            if (n % i == 0)
            {
                
                if (i == (n / i))
                    result += i;
                else
                    result += (i + n / i);
            }
        }
      
       
        return (result + 1+n);
    }
    public static void main(String args[]){
            Iface ob = new Iface();
            int n ;
            System.out.println("enter the number for sumofdivisors");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            
            int sum1 = ob.sumofdivisors(n);
            System.out.println("the sum of divisors of "+ n+ " is "+sum1);
    }
}