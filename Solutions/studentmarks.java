import java.util.*;

import javax.lang.model.util.ElementScanner14;
class studentmarks {
   public static void main(String[] arg){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter mark in percentage:  ");
    float n = s.nextFloat();
    int div;
    if(n<35)
    div=1;
    else if(n>=35 && n<50)
    div=2;
    else if(n>=50 && n<70)
    div=3;
    else if(n>=70 && n<85)
    div=4;
    else
    div=5;
    switch(div){
        case 1: System.out.println("Fail");break;
        case 2: System.out.println("Third Division");break;
        case 3: System.out.println("Second Division");break;
        case 4: System.out.println("First Division");break;
        case 5: System.out.println("Distinction");
    }
   }
}