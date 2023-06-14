import java.util.Scanner;

public class JavaAssignmentQs {

    public static void main(String []args){
        JavaPractice jp = new JavaPractice();
        System.out.println("provide 2 inputs for addition:");
        Scanner newInp = new Scanner(System.in);
        int num1 = newInp.nextInt();
        int num2 = newInp.nextInt();
        int sumValue = jp.addition(num1, num2);
        System.out.println("Addition output: "+sumValue);
    }
}
