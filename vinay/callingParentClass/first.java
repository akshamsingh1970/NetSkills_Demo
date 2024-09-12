package NetSkills_Demo.vinay.callingParentClass;

import java.util.Scanner;

public class first {

    public static int sum(int a,int b){
        return a+b;
    }
   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=sum(a,b);
        System.out.println("sum is :"+sum);
   }
}
