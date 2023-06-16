import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

@java.lang.FunctionalInterface
interface ArithmeticInterface<T>{
    public T multiplyMethod(T x, T y);
}

class Employee{
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int id;
    private String name;

    public Employee(int a, String n){
        this.id = a;
        this.name = n;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class FunctionalInterface{
    public static void main(String[] args) {
        ArithmeticInterface<Integer> mulAr1 = (a , b) ->{
            return (a * b);
        };

        ArithmeticInterface<Float> mulAr2 = (a , b) ->{
            return (a * b);
        };

        ArithmeticInterface<Double> mulAr3 = (a , b) ->{
            return (a * b);
        };

        ArithmeticInterface<Long> mulAr4 = (a , b) ->{
            return (a * b);
        };

        System.out.println(mulAr1.multiplyMethod(23, 3));
        System.out.println(mulAr2.multiplyMethod(23.2F, 3.2F));
        System.out.println(mulAr3.multiplyMethod(3.34, 73.5));
        System.out.println(mulAr4.multiplyMethod(2345253L, 353235L));

        System.out.println();

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(12345, "John"));
        employees.add(new Employee(42345, "Sera"));
        employees.add(new Employee(17345, "Arlo"));
        employees.add(new Employee(72345, "Remi"));
        employees.add(new Employee(28345, "Blake"));

        employees.stream().sorted((e1,e2)->(e1.getName().compareTo(e2.getName()))).forEach(System.out::println);

        System.out.println();

        System.out.println("Give Line input to split:");
        Scanner scanInp = new Scanner(System.in);
        String Str = scanInp.nextLine();
        long count = Stream.of(Str.split(" ")).count();

        System.out.println("The number of words in the given string: "+count);

        System.out.println();

        HashMap<String, Integer> newMap = new HashMap<String, Integer>();
        newMap.put("John",1234);
        newMap.put("Sera",6313);
        newMap.put("Arlo",3423);
        newMap.put("Remi",456);
        newMap.put("Blake",52452);

        System.out.println("The given map sorted based on the values is: ");

        newMap.entrySet().stream().sorted((o1,o2)->(o1.getValue() - o2.getValue())).forEach(System.out::println);
    }
}