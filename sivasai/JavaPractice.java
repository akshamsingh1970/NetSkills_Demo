import javax.swing.*;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;


public class JavaPractice extends JavaProblem{
    public static void main(String []args){

//        DivideException(args[0], args[1]);
        DivideException();
        System.out.println();
        SortString();
        System.out.println();
        System.out.println("Input a number: ");
        Scanner newInp = new Scanner(System.in);
        int num = newInp.nextInt();
        JavaProblem newObj = new JavaProblem();
        int DivisorsSum = newObj.Divisors(num);
        System.out.println("Sum of divisors: "+DivisorsSum);

    }

    public static void DivideException(){//String str1, String str2){

        try {
//            int num1 = Integer.parseInt(str1);
//            int num2 = Integer.parseInt(str2);
            System.out.println("Input 2 numbers: ");
            Scanner newInp = new Scanner(System.in);
            int num1 = newInp.nextInt();
            int num2 = newInp.nextInt();

            int num3 = (int) num1 / num2;
            System.out.println("Output: " + num3);
        }catch(Exception exp) {
            System.out.println(exp);
            System.out.println(exp.getMessage());
        }
    }

    public static void SortString(){
        String []str = {"-100","50",".12","0.12","0","000.000"};
        PriorityQueue<String> queue = new PriorityQueue<>(new customComparator());
        int len = str.length;
        for(int i=0;i<len;i++){
            queue.add(str[i]);
        }

        System.out.println("Output array: ");
        for(int i=0;i<len;i++){
            str[i] = (String) queue.poll();
            System.out.print(str[i]+" ");
        }
        System.out.println();
    }
}