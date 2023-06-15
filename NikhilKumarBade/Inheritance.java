import java.util.*;
class Sample {
    public int sum(int a, int b){
        return a+b;
    }
}
class Sample1 extends Sample {
}

public class Inheritance {
    public static void main(String[] arg){
        Sample1 s1 = new Sample1();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a and b ");
        int a,b;
        a=s.nextInt();
        b=s.nextInt();
        System.out.println(s1.sum(a,b));;
    }
}

