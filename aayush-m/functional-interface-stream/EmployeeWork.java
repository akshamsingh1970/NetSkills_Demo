import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeWork {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Ritik", 1));
        employeeList.add(new Employee("Abhinav", 2));
        employeeList.add(new Employee("Aayush", 3));

        List<Employee> sortedList = employeeList.stream()
        .sorted((o1, o2) -> {
            return o1.getName().compareTo(o2.getName());
        })
        .collect(Collectors.toList());

        for(Employee ele: sortedList)   {
            System.out.println(ele.name);
        }
    }
}

class Employee  {
    String name;
    int id;
    Employee(String name, int id)   {
        this.name = name;
        this.id = id;
    }

    String getName()    {
        return name;
    }

    int getID() {
        return id;
    }

}
