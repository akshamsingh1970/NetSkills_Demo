public class swap {

    public static void main(String args[])
    {
        int a = 5,b=10;
        System.out.println("value of a is "+a+", value of b is "+b);
        int temp = a;
        a=b;
        b=temp;
        System.out.println("Now value of a is "+a+", value of b is "+b);
    }
}
