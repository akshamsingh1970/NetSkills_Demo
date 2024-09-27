import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the percentage: ");
        double percentage = scanner.nextDouble();
        
        if (percentage >= 80) {
            System.out.println("Division: Distinction");
        } else if (percentage >= 60) {
            System.out.println("Division: First Division");
        } else if (percentage >= 45) {
            System.out.println("Division: Second Division");
        } else if (percentage >= 33) {
            System.out.println("Division: Third Division");
        } else {
            System.out.println("Division: Fail");
        }
        
        // Using switch statement
        int division = (int) (percentage / 10); // Calculate division based on tens digit
        
        switch (division) {
            case 10:
            case 9:
                System.out.println("Division (Switch): Distinction");
                break;
            case 8:
            case 7:
            case 6:
                System.out.println("Division (Switch): First Division");
                break;
            case 5:
            case 4:
                System.out.println("Division (Switch): Second Division");
                break;
            case 3:
                System.out.println("Division (Switch): Third Division");
                break;
            default:
                System.out.println("Division (Switch): Fail");
        }
    }
}

