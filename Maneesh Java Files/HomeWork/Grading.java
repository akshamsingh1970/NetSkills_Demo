import java.util.Scanner;

class Grading {
    public static void findCategory(int marks) {
        int category = (marks >= 70) ? 1
                : (marks >= 60) ? 2 : (marks >= 50) ? 3 : (marks >= 40) ? 4 : (marks >= 35) ? 5 : 6;

        switch (category) {
            case 1:
                System.out.println("Distinction");
                break;
            case 2:
                System.out.println("First Class");
                break;
            case 3:
                System.out.println("Second Class");
                break;
            case 4:
                System.out.println("Third Class");
                break;
            case 5:
                System.out.println("Passed");
                break;
            default:
                System.out.println("Failed");
                break;
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter marks to find its category: ");
            int num = sc.nextInt();
            findCategory(num);
        }
        
    }
}
