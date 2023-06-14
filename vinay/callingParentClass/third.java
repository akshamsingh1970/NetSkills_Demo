package NetSkills_Demo.vinay.callingParentClass;

import java.util.Scanner;

public class third {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        second object=new second();
        int sum=object.sum(a,b);
        System.out.println("sum is :"+sum);
    }
}
