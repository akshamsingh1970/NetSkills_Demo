package FunctionalInterfaceQues;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {

        squareRoot obj=(int n)->{
            int res=1;
            for(int i=n;i>=2;i--){
                res*=i;
            }
            return res;
        };
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       System.out.println(obj.res(n));
       sc.close();
        
    }
}
interface squareRoot{
    public int res(int a); 
}
