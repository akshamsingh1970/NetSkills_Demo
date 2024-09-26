public class PerfectSquare {

@FunctionalInterface
interface PerfectSquareInterface    {
    boolean check(int n);
}

    public static void main(String[] args) {
        int num = 64;
        PerfectSquareInterface PSI = (n) -> {return (Math.floor(Math.sqrt(n))*Math.floor(Math.sqrt(n))==n)? true:false;};  
        System.out.println(PSI.check(num));
    }
}
