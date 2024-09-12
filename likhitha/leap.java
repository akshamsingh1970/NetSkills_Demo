import java.util.Scanner;

class leap{
    public static void main(String[] arg){
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter year ");
            int n=s.nextInt();
            if(n%4!=0)
            System.out.println(n+" is not leap year");
            else{
                if(n%100==0 && n%400==0)
                System.out.println(n+" is leap year");
                else if(n%100==0 && n%400!=0)
                System.out.println(n+" is not leap year");
                else 
                System.out.println(n+" is leap year");
            }
        }

    }
}
