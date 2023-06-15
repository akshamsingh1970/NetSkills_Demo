


public class day2q1 {
    public static void main(String[] args)
    {
        class_1 a= new class_1();
        int ans=a.sum_all(3,5);
        System.out.println(ans);
    }

}
class class_1{

    int  sum_all(int a,int b)
    {
        return a+b;
    }

}
class class_2 extends class_1{

}

