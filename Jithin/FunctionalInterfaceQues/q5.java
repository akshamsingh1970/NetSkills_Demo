package FunctionalInterfaceQues;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        factorial obj=(int n)->{
            boolean res=false;
            for(int i=0;i<=Math.sqrt(n);i++){
                if(i*i==n){
                    res=true;
                }
            }
            return res;
        };
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       System.out.println(obj.res(n));
       sc.close();
    }
}

interface factorial{
    public boolean res(int a); 
}
