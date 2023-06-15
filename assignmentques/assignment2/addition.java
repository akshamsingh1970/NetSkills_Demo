public class addition {
    public static void main(String[] args)
    {
        secondClass sc=new secondClass();
        System.out.println(sc.add(5, 6));
    }
}

class firstClass{
    public int add(int a,int b){
        return a+b;
    }
}

class secondClass extends firstClass{
    @Override
    public int add(int a, int b) {
        return super.add(a, b);
    }
}