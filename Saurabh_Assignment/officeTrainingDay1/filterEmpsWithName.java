import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int id;

    Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    String getName(){
        return name;
    }
}

class Main{
    public static void main(String args[]){
        List<Employee> empList = new ArrayList<Employee>();

        empList.add(new Employee("saurabh", 1));
        empList.add(new Employee("Amit", 2));
        empList.add(new Employee("aarav", 3));
        empList.add(new Employee("yatish", 4));
        empList.add(new Employee("Siva", 5));

        List<String> list = empList.stream().filter(e -> e.getName().startsWith("A") || e.getName().startsWith("a")).map(e -> e.getName()).collect(Collectors.toList());
        // .matches("(a|A).*")) is expensive
        // in map we can also use method ref like Employee::getName
        for(String s: list){
            System.out.println(s);
        }
        
        // fill the empList
        
    }
}