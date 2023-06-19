public class q4 {
    public static boolean fun(int num){
        if(num%2==0) return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Even Numbers");
        for(int i=1;i<=20;i++){
            if(fun(i)==true) System.out.print(i+" ");
        }
        System.out.println("\nOdd Numbers");
        for(int i=1;i<=20;i++){
            if(fun(i)==false) System.out.print(i+" ");
        }
    }
}
