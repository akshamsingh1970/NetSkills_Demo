public class JavaProblem implements addInterface{

    @Override
    public int Divisors(int num) {
        int sumOfDivisors = 0;
        for(int i=1;i<=num;i++){
            if(num%i == 0){
                sumOfDivisors+=i;
            }
        }
        return sumOfDivisors;
    }

    public int addition(int a, int b){
        return a+b;
    }
}
