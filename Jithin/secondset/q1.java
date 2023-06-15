package secondset;

public class q1 {
    public static void main(String[] args) {
        int a=5, b=10;
        child obj=new child();
        System.out.println(obj.sum(a, b));
    }
}
class parent{
    public int sum(int a,int b){
        return a+b;
    }
}
class child extends parent{
    
}
