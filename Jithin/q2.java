public class q2 {
    public static boolean fun(int num){

        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
         for(int i=1;i<=20;i++){
            if(fun(i)==true) System.out.print(i+" ");
        }
        
    }
}
