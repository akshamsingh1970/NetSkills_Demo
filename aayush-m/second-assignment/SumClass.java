public class SumClass {
    public static void main(String[] args) {
        SecondClass sc = new SecondClass();
        System.out.println(sc.add(15, 15));
    }
}

class firstClass    {
    public int add(int a, int b)    {
        return a+b;
    }
}

class SecondClass extends firstClass    {
    @Override
    public int add(int a, int b) {
        return super.add(a, b);
    }
}
