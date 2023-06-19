package secondset;

import java.util.Scanner;

interface parentM{
    public int fun(int a);
}
class childM implements parentM{
    public int fun(int a){
        int sum=0;
        for(int i=1;i<=Math.sqrt(a);i++){
            if(a%i==0){
                sum+=i;
            }
        }
        return sum;
    }
}

public class q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        int a=sc.nextInt();
        childM obj=new childM();
        System.out.println(obj.fun(a));
        sc.close();
    }
}
