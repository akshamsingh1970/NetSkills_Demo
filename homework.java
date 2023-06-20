   /*                          First 12 questions code are in Class Solution                   */

/*                           Programming file 12 questions and 4 questions of JavaQuestions1 file Are in this file */



import java.io.*;
import java.util.*;
import java.lang.*;


// Question1 of JavaQuestions1 file
// Classes One, Two Three  used for first Question of JavaQuestions1 file
//Class 1

class One{
    public int sumOfTwoNumbers(int a,int b){
        return a+b;
    }
}

// Class Two Child of One


class Two extends One{

}

class Three{
    public void printFunction(Two t,int a,int b){
        System.out.println(t.sumOfTwoNumbers(a,b));

    }
}



//Question 2 of JavaQuestions1 file
// Interface for Sum of Divisors

interface Divisors{
    int sumOfDivisors(int n);
}

// Class Implementing Sum of Divisors


class AnswerClass implements Divisors{
    public int sumOfDivisors(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }
}



// Question 3 of JavaQuestions1 file
// Custom Pair Class

 class MyPair
{
    private  Double key;
    private Integer value;

    public MyPair(Double aKey, Integer aValue)
    {
        key   = aKey;
        value = aValue;
    }

    public Double Key()   { return key; }
    public Integer Value() { return value; }
}


// Comparator function for Sorting

class Sortbykey implements Comparator<MyPair> {
    // Used for sorting in ascending order of Key
    public int compare(MyPair a, MyPair b)
    {
        return Double.compare(a.Key(),b.Key());
    }
}


class Sorting{
static public void SortStringArray(String[] arr,int n){
              
            MyPair[] p=new MyPair[n];
            String[] ans=new String[n];
            for(int i=0;i<n;i++){
             p[i]=new MyPair(Double.parseDouble(arr[i+1]),i+1);
            }
            Arrays.sort(p,new Sortbykey());
            int j=0;
            for(int i=n-1;i>=0;i--){
                ans[j++]=arr[p[i].Value()];
            }
            for(int i=0;i<n;i++){
                System.out.print(ans[i]+" ");
            }
            System.out.println();
}
}



                     /*     1   -   12   of Programming questions file  are in below Class        */




class Solution{
 
     //Question 1 of Programming Question file
     //Reverse a string

    static String reverse(String p)

    {
        String rev="";
     int n=p.length();
      for(int i=n-1;i>=0;i--){
          rev+=p.charAt(i);
          
      }

    return rev;

    }


    //Question 2 of Programming Question file
    //print prime between 1 to 20

    static int[] prime()

    {
        int[] primes=new int[100];
        int cnt=0;
        for(int i=2;i<=20;i++){
        boolean a=true;
        for(int j=i-1;j>1;j--){
            if(i%j==0)a=false;
        }
        if(a){
       primes[cnt]=i;
       cnt++;
        }
    }

        return primes;

    }

    
    
    //Question 3 of Programming Question file
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

    

    //Question 4 of Programming Question file
    //print even and odd numbers between 1 to 20

    static void even_odd(int n)

    {

        System.out.println("EVEN NUMBERS: ");


        for(int i=1;i<=n;i++)

        {

            if(i%2==0)

            {

                System.out.println(i);

            }

        }

        System.out.println();

        System.out.println("ODD NUMBERS: ");

        for(int i=1;i<=n;i++)

        {

            if(i%2!=0)

            {

                System.out.println(i);

            }

        }

        

    }

    
    //Question 6 of Programming Question file
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

    
    //Question 7 of Programming Question file
    //Swap a and b

    static void swap(int a,int b)

    {

        System.out.println("Numbers before swaping: "+"a = "+a+" b = "+ b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Numbers after swaping: "+"a = "+a+" b = "+ b);

    }
    
    
    //Question 8 of Programming Question file
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

    
    //Question 5 of Programming Question file
    //Grading using if else

    static void Grading(int percent)

    {

        if(percent>=90)

        {

            System.out.println("Dictation Grade");

        }

        else if(percent<90 && percent>=80)

        {

            System.out.println("1st Grade");

        }

        else if(percent<80 && percent >=60)

        {

            System.out.println("2nd Grade");

        }

        else if(percent<60 && percent>=40)

        {

            System.out.println("3rd Grade");

        }

        else

        {

            System.out.println("The student has been failed");

        }

    }

    

    //Grading using switch case

    

    static void switch_grading(int percent)

    {

        int f=percent/10;

        switch(f)

        {

            case 10:

                System.out.println("Dictation Grade");

                break;

            case 9:

                System.out.println("Dictation Grade");

                break;

            case 8:

                System.out.println("1st Grade");

                break;

            case 7:

                System.out.println("2nd Grade");

                break;

            case 6:

                System.out.println("2nd Grade");

                break;

            case 5:

                System.out.println("3rd Grade");

                break;

            case 4:

                System.out.println("3rd Grade");

                break;

            case 3:

                System.out.println("The student has been failed");

                break;

            case 2:

                System.out.println("The student has been failed");

                break;

            case 1:

                System.out.println("The student has been failed");

                break;

            case 0:

                System.out.println("The student has been failed");

                break;

        }

    }
  
  
  //Question 9 of Programming Question file
  // Solid Diamond Pattern

    static void SolidDiamondPattern(int n){
          int spaceCount=n-1;
          boolean flag=false;
          for(int i=2*n-1;i>0;i--){
            
            int currentSpaces=spaceCount;
            for(int j=currentSpaces;j>0;j--){
                System.out.print(" ");
            }
            for(int k=n-currentSpaces;k>0;k--){
                System.out.print("* ");
            }
            System.out.print("\n");
            if(!flag){
                spaceCount--;
                if(spaceCount<0){
                    spaceCount=1;
                    flag=true;
                }
            }else spaceCount++;
          }
    }




//Question 10 of Programming Question file
// Pant pattern

 static void PantPattern(int n){
    for(int i=0;i<n;i++)System.out.print("*");
    System.out.print("\n");
    int leftCount=n/2;
    //int rightCount=n/2;
    boolean flag=false;
    if(n%2==1)flag=true;
    int spaceCount=1;
    while(leftCount>0){
          if(flag){
            for(int i=0;i<leftCount;i++)System.out.print("*");
            leftCount--;
            for(int i=0;i<spaceCount;i++)System.out.print(" ");
            for(int j=leftCount+spaceCount+1;j<n;j++)System.out.print("*");
            spaceCount+=2;
            System.out.print("\n");
          }else{
           for(int i=0;i<leftCount;i++)System.out.print("*");
           for(int i=0;i<spaceCount;i++)System.out.print(" ");
            for(int j=leftCount+1;j<n;j++)System.out.print("*");
            leftCount-=2;
            spaceCount+=3;
            System.out.print("\n");
            flag=true;
          }
    }
 }



  //Question 11 of Programming Question file
 // Invert Pant Pattern

 static void InvertPantPattern(int n){
   int spaceCount=n-2;
   /*(System.out.print("*");
   for(int i=0;i<spaceCount;i++){
    System.out.print(" ");
   }
   Sytem.out.print("*\n");
   spaceCount-=2;*/
   int leftCount=1;
   boolean flag=false;
   if(n%2==1)flag=true;
   while(spaceCount>0){
     if(flag){
    for(int i=0;i<leftCount;i++)System.out.print("*");
    for(int i=0;i<spaceCount;i++)System.out.print(" ");
    for(int i=leftCount+spaceCount;i<n;i++)System.out.print("*");
    System.out.print("\n");
    leftCount++;
    spaceCount-=2;
     }else{
    for(int i=0;i<leftCount;i++)System.out.print("*");
    for(int i=0;i<spaceCount;i++)System.out.print(" ");
    for(int i=leftCount+spaceCount;i<n;i++)System.out.print("*");
    System.out.print("\n");
    if(spaceCount==4){
        leftCount+=2;
        spaceCount=1;
    }else{
    leftCount++;
    spaceCount-=2;}
     }
   }
   for(int i=0;i<n;i++)System.out.print("*");
   System.out.print("\n");
 }



 //Question 12 of Programming Question file
 // Third Maximum Element using a Single Loop
 static void ThirdMaxElement(int [] array,int n){
    //adding array[i]!=first && array[i]!=second && array[i]!=third && gives unique one ignores repeated elements.
    int first=array[0],second=Integer.MIN_VALUE,third=Integer.MIN_VALUE;
    for(int i=1;i<n;i++){
        if(array[i]>first){
            third=second;
            second=first;
            first=array[i];

        }else if(array[i]>second){
            third=second;
            second=array[i];
        }else if(array[i]>third){
            third=array[i];
        }
    }
    System.out.println(third);
 }

 
}
             /*                              Main function is in the class Below                 */




class homework

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



//Tables from 2 to 5

System.out.println("TABLES");

int n=5;

d.tables(n);

 
 

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

   //Diamond pattern
   int num;
   System.out.println("Enter the number of stars Diamond must have in middle: ");
   num=sc.nextInt();
   d.SolidDiamondPattern(num);



   //pants style pattern
   int num1;
   System.out.println("Enter the number of stars pant must have at start: ");
   num1=sc.nextInt();
   d.PantPattern(num1);



   //Invert pants style pattern
   int num2;
   System.out.println("Enter the number of stars pant must have at bottom atleast 2: ");
   num2=sc.nextInt();
   d.InvertPantPattern(num2);



  //Third Maximum Element using single loop;
  int sz;
  System.out.println("Enter the array size for getting third max Element Question: ");
  sz=sc.nextInt();
  System.out.println("Enter the array elements which has atleast three elements: ");
  int [] array=new int[sz];
  for(int i=0;i<sz;i++){
    array[i]=sc.nextInt();
  }
  d.ThirdMaxElement(array,sz);



  // Code for sorting String with Doubles
        int n1;
        System.out.print("Enter the size of the Array for Sorting: ");
        n1=sc.nextInt();
        String [] arr=new String[n1+1];
        System.out.print("Enter the strings with double values separated by new line For Sorting of the Array: ");
        for(int i=0;i<n1+1;i++){
            arr[i]=sc.nextLine();       
            //System.out.println(arr[i]+ " "+i); 
            }
        Sorting st=new Sorting();
       st.SortStringArray(arr,n1);


   // For Sum of Divisors
    AnswerClass res=new AnswerClass();
    int DivisorOf;
    System.out.println("Enter The number to get its Sum of Divisors: ");
    DivisorOf=sc.nextInt();
    System.out.println(res.sumOfDivisors(DivisorOf));

   //Using Two class object printing class method method by third class

   Two t=new Two();
   int number1,number2;
   System.out.println("Enter two numbers number1 and number2 for which we need to add using child object:  ");
   number1=sc.nextInt();
   number2=sc.nextInt();
   Three th=new Three();
   th.printFunction(t,number1,number2);
  
  //Question 4 of JavaQuestions1 file

  try{
        int a1,b1;
        System.out.println("Enter Values of a1 b1 for Exception Question:");
        a1=sc.nextInt();
        b1=sc.nextInt();
        int val=a1/b1;
        System.out.println(val);
        }
        catch(ArithmeticException e){
          System.out.println(e);
        }
        catch(InputMismatchException e){
            System.out.println(e);
        }
}


}

    

 

 

 

