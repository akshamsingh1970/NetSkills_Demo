@FunctionalInterface
interface FuncInterface<T1, T2, T3>{
    T3 multiply(T1 t1, T2 t2);
}

class Main{
    public static void main(String args[]){
        FuncInterface<Long, Double, Double> fi = (a, b)->{
            // System.out.println(a*b);
            return a*b;
        };
        System.out.println(fi.multiply(4L,5.0));
    }
}

// auto type promotion
        // int a = 5;
        // long l = a;
        // float f = l;
        // double d = f;