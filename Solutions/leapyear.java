import java.util.Scanner;

class leapyear{
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter year ");
        int n=s.nextInt();
        if(n%4!=0)
        System.out.println(n+" is not leap year");
        else{
            if((n%100!=0 && n%4==0) || (n%400==0))
            System.out.println(n+" is a leap year");
            else 
            System.out.println(n+" is not a leap year");
        }

    }
}