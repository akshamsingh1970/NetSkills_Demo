import java.lang.Math;
import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) {

        // String Reversal
        System.out.println("Enter the String to be Reversed:");
        Scanner stringScanner = new Scanner(System.in);
        String s = stringScanner.nextLine();
        System.out.println("Original: "+s);
        System.out.println("Reversed: "+reverseString(s)+"\n");

        //Prime Numbers between 1-20
        System.out.println("Prime Numbers between 1-20:\n");
        primeNumbers(20);

        //2-5 Tables
        System.out.println("\n2-5 Tables");
        printTables(2,5);

        //Even-Odd Numbers till 20
        System.out.println("\nEven-Odd Numbers till 20");
        evenOdd(20);

        //Marks Ranking
        int[] marks=new int[]{10,34,56,78,33,99,77,65,79};
        System.out.println();
        studentRanking(marks);

        //Factorial of 8
        System.out.println("\nFactorial of 8: "+factorial(8));

        //Swapping a and b
        System.out.println("\nSwapping a and b");
        int a=5;
        int b=10;
        System.out.println("Original: a="+a+", b="+b);
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println("Swapped: a="+a+", b="+b);

        //Leap Year
        isLeapYear(1990);
    }
    private static String reverseString(String s){
            String rev= "";
            for(int i=s.length()-1; i>=0;i--){
               rev+=s.charAt(i);
            } 
            return rev;
    }
    private static void primeNumbers(int end){
        System.out.println("1 is Neither Prime Nor Composite");
        for(int i=2; i<=end; i++ ){
            double condition=Math.sqrt(i);
            Boolean isComposite= true;
            for(int j=2; j<=condition;j++){
                if(i%j==0){
                    isComposite=false;
                }
            }
            if(isComposite){
                System.out.println(i+" is Composite");
            }
            else{
                System.out.println(i+" is Prime");
            }
        }
    }
    private static void printTables(int start, int end){
        for(int i=start; i<=end; i++){
            System.out.println("");
            System.out.println(i+" Table");
            for(int j=1;j<=10;j++){
                int val=i*j;
                System.out.println(i+"x"+j+"="+val);
            }
        }
    }
    private static void evenOdd(int end){
        for(int i=1; i<=end; i++){
            if(i%2==0){
                System.out.println(i+" is Even");
            }
            else{
                System.out.println(i+" is Odd");
            }
        }
    }
    private static void studentRanking(int[] marks){
        for(int mark : marks){
            if(mark>=90){
                System.out.println("Marks: "+mark+"= DISTINCTION");
            }
            else if(mark>=80 && mark<90){
                System.out.println("Marks: "+mark+"= First Division");
            }
            else if(mark>=70 && mark<80){
                System.out.println("Marks: "+mark+"= Second Division");
            }
            else if(mark>=60 && mark<70){
                System.out.println("Marks: "+mark+"= Third Division");
            }
            else{
                System.out.println("Marks: "+mark+"= Fail");
            }
        }
    }
    private static int factorial(int n){
        int ans=1;
        for(int i=n;i>1;i--){
            ans*=i;
        }
        return ans;
    }
    private static void isLeapYear(int year){
        if(year%400==0){
            System.out.println("\n"+year+" is a Leap Year");
        }
        else if(year%100!=0 && year%4==0){
            System.out.println("\n"+year+" is a Leap Year");
        }
        else{
            System.out.println("\n"+year+" is NOT a Leap Year");
        }
    }
};