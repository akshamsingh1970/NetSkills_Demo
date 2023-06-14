public class hier {
    public static void main(String[] args){
        B var = new B();
        int c = var.add(2,3);
        System.out.println(c);
    }
}

class A{
    int add(int n,int m){
        return n+m;
    }
}

class B extends A{

}
