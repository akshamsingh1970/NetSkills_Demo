public class DivisorSum implements DivisorInterface{
    public static void main(String[] args) {
        DivisorSum d1 = new DivisorSum();
        System.out.println(d1.sum(999));
    }

    @Override
    public int sum(int n) {
        int sum = 0;
        if(n > 1000)
            return -1;
        else    {
            for(int i = 1; i <= n; i++) {
                sum += (n%i==0)?i:0;
            }
            return sum;
        }
    }
}

interface DivisorInterface  {
    public int sum(int n);
}
