import java.lang.Math;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String []args){
        // String str = args[0];

        reverseStr();
        System.out.println();

        primeNumbers(1, 20);
        System.out.println();

        printTables(2,5);
        System.out.println();

        OddOrEve(1,20);
        System.out.println();

        GradeDivision();
        System.out.println();

        Factorial(8);
        System.out.println();

        Scanner newInp = new Scanner(System.in);
        System.out.println("Input numbers to swap: ");
        int a = newInp.nextInt();
        int b = newInp.nextInt();
        System.out.println("Initial numbers: "+a+" "+b);
        int[] arr = Swap(a,b);
        a = arr[0];
        b = arr[1];
        System.out.println("Numbers after swapping: "+a+" "+b);
        System.out.println();

        LeapYear();
    }
    public static void reverseStr(){
        Scanner newInp = new Scanner(System.in);
        System.out.println("Input string to reverse: ");
        String str = newInp.nextLine();
//        System.out.println(str);
        int a = str.length();
//         System.out.println(a);
        System.out.println("Original string: "+ str);
        System.out.print("Reversed string: ");
        for(int i=a-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    public static boolean verifyPrime(int num){
        int a = (int)Math.sqrt(num);
        int cnt = 0;
        for(int i=1;i<=a;i++){
            if(num%i == 0){
                cnt+=1;
            }
        }
        if(cnt == 1){
            return true;
        }
        return false;
    }

    public static void primeNumbers(int min, int max){
        if(min == 1){
            min = 2;
        }
        for(int i=min;i<=max;i++){
            if(verifyPrime(i) == true){
                System.out.println(i);
            }
        }
    }

    public static void printTables(int min, int max){
        for(int a=min;a<=max;a++){
            for(int i=1;i<=10;i++){
                System.out.println(a + "*" + i + "="+ a*i);
            }
        }
    }

    public static void OddOrEve(int min, int max){
        ArrayList<Integer> odd = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();
        for(int a=min;a<=max;a++){
            if(a%2 == 0){
                even.add(a);
            }
            else{
                odd.add(a);
            }
        }

        System.out.println(even);
        System.out.println(odd);
    }

    public static void GradeDivision(){
        Scanner newScan = new Scanner(System.in);
        System.out.println("Input marks: ");
        int percent = newScan.nextInt();
        System.out.println("your marks are: "+percent);
        System.out.println("your Division is: ");
        if(percent>90){
            System.out.println("Distinction!!");
        }
        else if(percent<=90 && percent>80){
            System.out.println("First division!!");
        }
        else if(percent<=80 && percent>70){
            System.out.println("Second division!");
        }
        else if(percent<=70 && percent>=50){
            System.out.println("Third division!");
        }
        else{
            System.out.println("Fail");
        }
    }

    public static void Factorial(int num){
        long fact = 1;
        for(long i=1;i<=(long)num;i++){
            fact*=i;
        }
        System.out.println("The factorial of "+num+" is: "+fact);
    }

    public static void LeapYear(){
        Scanner newInp = new Scanner(System.in);
        System.out.println("Input year: ");
        int num = newInp.nextInt();
        if(num%100 == 0){
            if(num%400 == 0){
                System.out.println("The given year "+num+" is a leap year");
            }
            else{
                System.out.println("The given year "+num+" is NOT a leap year");
            }
        }
        else if(num%4 == 0){
            System.out.println("The given year "+num+" is a leap year");
        }
        else{
            System.out.println("The given year "+num+" is NOT a leap year");
        }
    }

    public static int[] Swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        int[] arr = {a,b}; //xor operation and addition and subtraction
        return arr;
    }
}