import java.util.Scanner;

class first{
    int sum(int a,int b){
        return a+b;
    }
}
class second extends first{
    void show(){
        System.out.println("Hello from Second Class");
    }
}



class firstProblem{
    public static void main(String args[]){
        second ob = new second();
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        int c = ob.sum(a,b);
        System.out.println("the result of sum is "+c);
    }
}