import java.util.Scanner;

public class studentDivision {
    public static void main(String[] args){
        int percentage;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the percentage of the student: ");
        percentage = sc.nextInt();

        // Implementing the logic
        if( percentage < 33 ){
            System.out.println("Ooppss! You are fail. Better luck next time");
        }
        else if((percentage >=33) && (percentage < 45)){
                System.out.println("Third Division");
        }
        else if((percentage>=45) && (percentage<60)){
                System.out.println("Second Division");
        }
        else{
                System.out.println("First Division");
        }
    }
}
