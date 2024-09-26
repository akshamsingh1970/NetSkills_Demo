public class Product    {

    @FunctionalInterface
    interface Multiplication<T> {
       T multiply(T a, T b);
    }

    public static void main(String[] args) {
        Multiplication<Integer> m1 = (a,b) -> {return a*b;};
        Multiplication<Long> m2 = (a,b) -> {return a*b;};
        Multiplication<Float> m3 = (a,b) -> {return a*b;};
        Multiplication<Double> m4 = (a,b) -> {return a*b;};

        System.out.println(m1.multiply(33, 12));
        System.out.println(m2.multiply(33L, 1288888888888L));
        System.out.println(m3.multiply(33F, 12.1222F));
        System.out.println(m4.multiply(33D, 12.12D));

    }

}