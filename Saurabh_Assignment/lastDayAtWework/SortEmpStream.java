/*

4-	Suppose we have a one Employee type list. Employee class have two fields name and 
id. Write a program to sort the list on the basis of Employee name with the help of 
Stream API.

 */

import java.util.*;
import java.util.stream.*; 
class Employee{
    private String name;
    private int id;

    Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    String getName(){
        return name;
    }

    int getId(){
        return id;
    }
}

class Main{
    public static void main(String args[]){
        List<Employee> empList = new ArrayList<Employee>();
        empList.addAll(Arrays.asList(
            new Employee("Saurabh", 1),
            new Employee("Yatish", 2),
            new Employee("Ankit", 3),
            new Employee("Deepak", 4),
            new Employee("Rahul", 5)
        ));
        
        Stream<Employee> empStream= empList.stream();
        empList = empStream.sorted((e1, e2)->e1.getName().compareTo(e2.getName())).collect(Collectors.toList());

        for(Employee emp: empList){
            System.out.println(emp.getName()+": "+emp.getId());
        }
    }
}