package NetSkills_Demo.codes;

public class java_first_day_problems {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // 1 reverse a string 
        String s= "hello world";
        String res="";
        int n=s.length();
        for(int i=0;i<n;i++){
            res= s.charAt(i)+res;
        }
        System.out.println(res);
        
        // 2 print primes less than 20
        int num = 20, count;
        for (int i = 1; i <= num; i++) {
            count = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                count++;
                break;
                }
        }

        if (count == 0) {
        System.out.println(i);
        }

        }
        
         // 3 program to print odd and even numbers less than 20
        for(int k=1;k<=20;k++)
        {
            if(k%2==0){
                System.out.println("even-"+k);
            }
        }
        for(int k=1;k<=20;k++)
        {
            if(k%2!=0){
                System.out.println("odd-"+k);
            }
        }
        // 4 program to print tables of 2 to 5
        for(int number=2; number <= 5; number++)  
        {  
            for(int i=1;i<10;i++)
            {
                System.out.println(number+" * "+i+" = "+number*i);  
            }
        }  
        
        // 5 program to print division of student marks based on percentage
        
        int marks= 55;
        
        if(marks >75){
            System.out.println("Grade A");
        }
        else if(marks >=55 && marks <75){
            System.out.println("Grade B");
        }
        else if(marks >=35 && marks <55){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Fail");
        }
       
        // 6 factorial of 8
        int ans=1;
        for(int g=2;g<=8;g++){
            ans = ans * g;
        }
        System.out.println("factorial of 8 is-"+ans);
        
        // 7 program to swap a and b numbers;
        int x = 100, y = 200;
 
        System.out.println("Before Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
 
        int temp = x;
        x = y;
        y = temp;
 
        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        
        // 8 leap year or not
        int year = 2020;
        boolean isLeapYear;

        isLeapYear = (year % 4 == 0);

        isLeapYear = isLeapYear && (year % 100 != 0 || year % 400 == 0);

        if (isLeapYear) {
        System.out.println(year + " is a leap year.");
        } else {
        System.out.println(year + " is not a leap year.");
        }
        }
}