class q1 {
   int myMethod(int a, int b) {
    return a+b;
    // System.out.println(c);
    
  }
}

class class2 extends q1{   

}

public class class3{
  public static void main(String[] args) {
    class2 obj = new class2();

    int d = obj.myMethod(6,8);
    System.out.println(d);

    // myMethod(3,6);
  }
}

