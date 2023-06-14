import java.util.*;

class ClassFirst {
    public static int sum(int a, int b){
        int ans = a + b;
        return ans;
    }
}

class SecondClass extends ClassFirst{

}

public class FIrstClass{
    public static void main(String args[]){
        SecondClass obj = new SecondClass();
        int result = obj.sum(3,4);
        System.out.println(result);
    }

}
