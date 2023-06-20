import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeName   {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Aayush", 22));
        employeeList.add(new Employee("Abhinav", 233));
        employeeList.add(new Employee("Dheeraj", 2334));
        employeeList.add(new Employee("Prithvi", 2222));
        employeeList.add(new Employee("Ritik", 111));
        employeeList.add(new Employee("aayush", 0));

        List<String> filterList = employeeList.stream()
        .map(Employee::getName)
        .filter(p->p.toLowerCase().startsWith("a"))
        .collect(Collectors.toList());

        for (String string : filterList) {
            System.out.println(string);
        }
    }
}

class Employee{
    String name;
    int id;
    Employee(String name, int id)   {
        this.name = name;
        this.id = id;
    }
    String getName()    {
        return name;
    }
}