
public class inter implements face1{
    public static void main(String[] args){
        inter var = new inter();
        System.out.println(var.add(8));
    }

    public int add(int num){
        if (num>1000){
            System.out.println("Large number: use number less than 1000");
            return 0;
        }
       int result = 0;
      
        // find all divisors which divides 'num' including itself
        for (int i = 1; i <= Math.sqrt(num); i++)
        {
            // if 'i' is divisor of 'num'
            if (num % i == 0)
            {
                // if both divisors are same then
                // add it only once else add both
                if (i == (num / i))
                    result += i;
                else
                    result += (i + num / i);
            }
        }
      
        return (result );
    }
}

interface face1 {
    public int add(int num);
}