import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

interface fact{
    int calcFactorial(int num);
}

public class StreamPractice {
    public static void main(String args[]){
        EvenOrOdd();
        System.out.println();
        removeDuplicates();
        System.out.println();
        factorial();
        System.out.println();
        FindElements();
        System.out.println();
        ConvertStringToUpperLower();
    }

    public static void EvenOrOdd(){
        List<Integer> numbers = new ArrayList<Integer>();
        List<Integer> odd = new ArrayList<Integer>();
        List<Integer> even = new ArrayList<Integer>();
        int num = 10;
        for(int i=0;i<num;i++){
            int t = (int)(Math.random()*150+50);
            numbers.add(t);
        }

        System.out.println("Original list: "+numbers);
        odd = numbers.stream().filter(n -> n%2 != 0).collect(Collectors.toList());
        even = numbers.stream().filter(n -> n%2 == 0).collect(Collectors.toList());

        System.out.println("Odd numbers: "+odd);
        System.out.println("Even numbers: "+even);
    }

    public static void removeDuplicates(){
        List<Integer> numbers = new ArrayList<Integer>();
        int num = 5;
        for(int i=0;i<num;i++){
            int t = (int)(Math.random()*150+50);
            numbers.add(t);
            numbers.add(t);
        }
        System.out.println("Original list: "+numbers);
        numbers = numbers.stream().distinct().collect(Collectors.toList());

        System.out.println("Final list: "+numbers);
    }

    public static void factorial(){
        int a = 8;
        fact f = (b) -> {
            int num = 1;
            for(int n=2;n<=b;n++){
                num*=n;
            }
            return num;
        };

        System.out.println("Factorial of "+a+" is: "+f.calcFactorial(a));
    }

    public static void FindElements(){
        List<Integer> numbers = new ArrayList<Integer>();
        int numMin2, numMin1;
        int num = 10;
        for(int i=0;i<num;i++){
            int t = (int)(Math.random()*150+50);
            numbers.add(t);
        }

        System.out.println("Original list: "+numbers);

        numbers = numbers.stream().sorted((a,b) -> a-b).collect(Collectors.toList());
        numMin1 = numbers.get(0);
        numMin2 = numbers.get(1);

        System.out.println("Minimum value is: "+numMin1+" Second smallest value: "+numMin2);
    }

    public static void ConvertStringToUpperLower(){
        List<String> strings = new ArrayList<String>();
        List<String> Lowerstrings = new ArrayList<String>();
        List<String> Upperstrings = new ArrayList<String>();
        strings.add("John");
        strings.add("arlo");
        strings.add("remi");
        strings.add("Sera");
        strings.add("Blyke");

        Lowerstrings = strings.stream().map((s)->s.toLowerCase()).collect(Collectors.toList());
        Upperstrings = strings.stream().map((s)->s.toUpperCase()).collect(Collectors.toList());

        System.out.println("Lower case of strings: "+Lowerstrings);
        System.out.println("Lower case of strings: "+Upperstrings);
    }
}
