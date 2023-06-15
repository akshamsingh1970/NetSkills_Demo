import java.util.*;

class Solution

{

    //Reverse a string

    static String reverse(String p)

    {

        String s=p;

        String reverse="";

    char[] S=new char[s.length()];

    int l=s.length()-1; 

    for(int i=0;i<=l;i++)

    {

        S[l-i]=s.charAt(i);

    }

    for(int i=0;i<S.length;i++)

    {

        reverse=reverse+(S[i]);

    }

    return reverse;

    }

    

    //print 2 to 5 tables

    static void tables(int n)

    {

        int N=n;

        for(int i=2;i<=N;i++)

        {

            for (int j=1;j<=10;j++)

            {

                System.out.println(i + " x " + j +" = " + i*j);

            }

            System.out.println();

        }

        

    }

    

    //print prime between 1 to 20

    static int[] prime()

    {

        int[] primes=new int[100];

        int k=0;

        for(int i=1;i<=20;i++)

        {

            int count=0;

            for(int j=1;j<=i/2;j++)

            {

                if(i%j==0)

                {

                    count++;

                }

            }

            if(count==1)

            {

                primes[k]=i;

                k++;

            }

        }

        return primes;

    }

    

    //print even and odd numbers between 1 to 20

    static void even_odd(int n)

    {

        System.out.println("EVEN NUMBERS: ");

        int m=n;

        for(int i=1;i<=m;i++)

        {

            if(i%2==0)

            {

                System.out.println(i);

            }

        }

        System.out.println();

        System.out.println("ODD NUMBERS: ");

        for(int i=1;i<=m;i++)

        {

            if(i%2!=0)

            {

                System.out.println(i);

            }

        }

        

    }

    

    //Factorial

    int factorial(int n)

    {

        if(n==0)

        {

            return 1;

        }

        else

        {

            return n*factorial(n-1);

        }

    }

    

    //Swap a and b

    

    static void swap(int a,int b)

    {

        System.out.println("Numbers before swaping: "+"a = "+a+" b = "+ b);

        a=a+b;

        b=a-b;

        a=a-b;

        System.out.println("Numbers after swaping: "+"a = "+a+" b = "+ b);

    }

    

    //leap year or not

    static void leap(int n)

    {

        if(((n%4==0) && (n%100!=0)) || (n%400==0))

        {

            System.out.println(n+" is a leap year");

        }

        else

        {

            System.out.println(n+" is not a leap year");

        }

    }

    

    //Grading using if else

    

    static void Grading(int percent)

    {

        if(percent>=90)

        {

            System.out.println("The student has achieved Dictation Grade");

        }

        else if(percent<90 && percent>=80)

        {

            System.out.println("The student has achieved 1st Grade");

        }

        else if(percent<80 && percent >=60)

        {

            System.out.println("The student has achieved 2nd Grade");

        }

        else if(percent<60 && percent>=40)

        {

            System.out.println("The student has achieved 3rd Grade");

        }

        else

        {

            System.out.println("The student is failed");

        }

    }

    

    //Grading using switch case

    

    static void switch_grading(int percent)

    {

        int f=percent/10;

        switch(f)

        {

            case 10:

                System.out.println("The student has achieved Dictation Grade");

                break;

            case 9:

                System.out.println("The student has achieved Dictation Grade");

                break;

            case 8:

                System.out.println("The student has achieved 1st Grade");

                break;

            case 7:

                System.out.println("The student has achieved 2nd Grade");

                break;

            case 6:

                System.out.println("The student has achieved 2nd Grade");

                break;

            case 5:

                System.out.println("The student has achieved 3rd Grade");

                break;

            case 4:

                System.out.println("The student has achieved 3rd Grade");

                break;

            case 3:

                System.out.println("The student is failed");

                break;

            case 2:

                System.out.println("The student is failed");

                break;

            case 1:

                System.out.println("The student is failed");

                break;

            case 0:

                System.out.println("The student is failed");

                break;

        }

    }

    

}

 

 

 

public class Main

{

public static void main(String[] args) {

Solution d=new Solution();

Scanner sc=new Scanner(System.in);

//REVERSE A STRING

System.out.println("Enter the string to reverse: ");

String s=sc.nextLine();

System.out.println("String after reverse: ");

System.out.println(d.reverse(s));

System.out.println();

 

//TABLES FROM 2 to 5

System.out.println("TABLES");

int n=5;

d.tables(n);

 

//primes

int[] p=d.prime();

System.out.println("PRIME NUMBER BETWEEN 1 AND 20:");

for(int i=0;i<p.length;i++)

{

    if(p[i]!=0)

    {

        System.out.println(p[i]);

    }

}

System.out.println();

 

//even and odd

    d.even_odd(20);

    System.out.println();

   

    //factorial

    int fact=d.factorial(8);

    System.out.println("Factorial of 8 is: "+fact);

    System.out.println();

   

    //swapping Numbers

    d.swap(8,20);

    System.out.println();

   

    //leap

    d.leap(1990);

    System.out.println();

   

    //grade using if-else

    d.Grading(59);

   

    //grade using switch

   

    d.switch_grading(59);

   

}

 

}

//  Program to add two matrices

// import java.util.Scanner;

class Solution{
    public static void main(String args[]){
        // System.out.println("Hi");
        AddMatrices a = new AddMatrices();
        a.fun();
        // StarMaker b = new StarMaker();
        // b.fun();
        StarMaker2 c = new StarMaker2();
        c.fun();
    }
 }


 class AddMatrices{
    public static void fun(){
        // System.out.println("Ankit");
        int[][] m1 = {{1,2},{4,5}};
        int[][] m2 = {{3,2},{6,7}};

        int[][] sum = new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("First Matrix Input:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                
                m1[i][j] = sc.nextInt(); 
            }
        }
        System.out.println("Second Matrix Input:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                
                m2[i][j] = sc.nextInt(); 
            }
        }

        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m1[i].length;j++){
                sum[i][j] = m1[i][j] + m2[i][j];
            }
        }
        

        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m1.length;j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
 }

 

 class StarMaker{
    public static void fun(){
        for(int i=1;i<=5;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
 }

 class StarMaker2{
    public static void fun(){
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.println("Taking Input");
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int k=n-i;k>1;k--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
 }
 

 // 9-> Write a program to Print a solid Diamond Star Pattern.

