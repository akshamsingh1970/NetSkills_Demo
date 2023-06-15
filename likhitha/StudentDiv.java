import java.util.*;
class StudentDiv{
public static void main(String[] arg){
    try (Scanner s = new Scanner(System.in)) {
        System.out.println("Enter percentage ");
        float n = s.nextFloat();
        int a;
        if(n<35)
        a=1;
        else if(n>=35 && n<50)
        a=2;
        else if(n>=50 && n<75)
        a=3;
        else if(n>=75 && n<90)
        a=4;
        else
        a=5;
        switch(a){
            case 1: System.out.println("Fail");break;
            case 2: System.out.println("Third Division");break;
            case 3: System.out.println("Second Division");break;
            case 4: System.out.println("First Division");break;
            case 5: System.out.println("Distinction");
        }
    }
   }
}
