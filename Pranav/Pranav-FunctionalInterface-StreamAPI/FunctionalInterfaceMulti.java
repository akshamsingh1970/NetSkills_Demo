@FunctionalInterface
interface Multi<T> {
    public T multiply(T x, T y);
}
public class FunctionalInterfaceMulti{
    public static void main(String[] args) {
        System.out.println("Multiplication using Generic Functional Interface");

        Multi<Integer> m1=(x,y)->{return x*y;};
        System.out.println("Int: "+m1.multiply(2,3));

        Multi<Float> m2=(x,y)->{return x*y;};
        System.out.println("Float: "+m2.multiply(23.14f,3.0000009f));

        Multi<Double> m3=(x,y)->{return x*y;};
        System.out.println("Double: "+m3.multiply(2.2,3.2));

        Multi< Long> m4=(x,y)->{return x*y;};
        System.out.println("Long: "+m4.multiply(2L,3L));
    }
}