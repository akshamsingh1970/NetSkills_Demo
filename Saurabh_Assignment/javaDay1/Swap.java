// 7-> Write a program to swap the a and b numbers. Where int a = 5; int b = 10;

class Prob{
    public static void solve(int a, int b){
        int t;
        t = a;
        a = b;
        b = t;
        System.out.println("After, a: "+a+" b: "+b);

    }
}

class Swap{
    public static void main(String args[]){
        int a = 5, b = 10;
        Prob p = new Prob();

        System.out.println("Before, a: "+a+" b: "+b);
        p.solve(a, b);
        
    }
}