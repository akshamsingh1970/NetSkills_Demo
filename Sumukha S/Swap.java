import java.util.Scanner;

public class Swap{
int a;
    int b;
    Swap(int m, int n){
       a = m;
       b = n;
    }
   public void swap(Swap ob1){
    int temp=0;
    temp = ob1.a;
    ob1.a=ob1.b;
    ob1.b = temp;
   }
    public static void main(String[] args){
        int m,n;
        System.out.println("Enter values of m and n");
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        Swap ob = new Swap(m,n);
        System.out.println("before swap "+"m = "+ob.a+" n = "+ob.b);
        ob.swap(ob);
        System.out.println("after swap "+"m = "+ob.a+" n = "+ob.b);
    }
}
