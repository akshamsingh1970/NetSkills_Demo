import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class employeeList {
    public static void main(String[] args) {
        ArrayList<Employee> listOfEmployees = new ArrayList<Employee>(); 
        listOfEmployees.add(new Employee("Sameer", 1001));
        listOfEmployees.add(new Employee("Pranav", 1002));
        listOfEmployees.add(new Employee("Siva Sai", 1003));
        listOfEmployees.add(new Employee("Reddy Anna", 1004));
        listOfEmployees.add(new Employee("Saurabh Mittal", 1005));
        listOfEmployees.add(new Employee("Yagnik Anna", 1006));

        List<Employee> sortedEmployeeList = new ArrayList<Employee>();
        Comparator<Employee>  NameCommparator = Comparator.comparing(Employee::getName);
        sortedEmployeeList = listOfEmployees.stream().sorted(NameCommparator).collect(Collectors.toList());

        for(Employee emp : sortedEmployeeList) {
            System.out.println("Employee Name: " + emp.getName() + ", Id: " + emp.getId());
        }
    }
}

class Employee {
    private String name;
    private int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
