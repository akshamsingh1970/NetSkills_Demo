public class funtionalInterfaceGenericType {
    public static void main(String[] args) {
        multiplicationClass<Integer> multiplyInteger = (x, y) -> {return x * y;};
        System.out.println("Integer multiplication: " + multiplyInteger.mutiply(1, 2));

        multiplicationClass<Float> multiplyFloat = (x, y) -> {return x * y;};
        System.out.println("Float multiplication: " + multiplyFloat.mutiply(1.287f, 2.4987f));

        multiplicationClass<Double> multiplyDouble = (x, y) -> {return x * y;};
        System.out.println("Double multiplication: " + multiplyDouble.mutiply(1.38789767659678968, 3.978676458696));

        multiplicationClass<Long> multiplyLong = (x, y) -> {return x * y;};
        System.out.println("Long multiplication: " + multiplyLong.mutiply(11L, 76L));
    }
}

@FunctionalInterface
interface multiplicationClass<T extends Number> {
    T mutiply(T a, T b);
}