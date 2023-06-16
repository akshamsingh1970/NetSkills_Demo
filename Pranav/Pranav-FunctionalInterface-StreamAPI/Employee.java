import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
    private int id;
    private String name;
    public Employee(int id,String name){
        this.id=id;
        this.name=name;
    }


    public static void main(String[] args){
        ArrayList<Employee> employees=new ArrayList<Employee>();
        employees.add(new Employee(1,"Sudeep"));
        employees.add(new Employee(2,"Ved Vade"));
        employees.add(new Employee(3,"Yagnik"));
        employees.add(new Employee(4,"Reddy Anna"));
        employees.add(new Employee(5,"Gundugopal"));

        Comparator<Employee> compareEmployees=Comparator.comparing(Employee::getName);
        List<Employee> sortedEmployees=employees.stream().sorted(compareEmployees).collect(Collectors.toList());
        System.out.println("Sorted Employees by Name: ");
        sortedEmployees.forEach(System.out::println);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
