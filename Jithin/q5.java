import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter new number:");
        int percentage=sc.nextInt();
        if(percentage >80){
            System.out.println("Dictation");
        }
        else if(percentage > 70){
            System.out.println("first division");
        }
        else if(percentage > 60){
            System.out.println("second division");
        }
        else if(percentage > 60){
            System.out.println("third division");
        }
        else{
            System.out.println("fail");
        }
        sc.close();
    }
}
