import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.*;
import java.lang.*;
import java.util.Map.Entry.*;
import java.util.Comparator; 
import java.util.HashMap; 
import java.util.LinkedHashMap; 
import java.util.Map;


@FunctionalInterface
interface GenericMultiplicationFunctionalInterface<T1 , T2, T>{
   public T multiplication(T1 a, T2 b);

}

class Employee{
    String name;
    int id;
    Employee(String name , int id){
        this.name=name;
        this.id=id;
    }
}


class FunctionalInterfaceAndStreamQuestions{
   public static void main(String[] args){
    
    // Question 1

    GenericMultiplicationFunctionalInterface<Float, Double, Double> gmfi=(a,b)->{
            return (a*b);
        };
    System.out.println(gmfi.multiplication(10.67f,500000.98));
   
   //Question 2

   String a;
   Scanner sc =new Scanner(System.in);
   System.out.print("Enter the String for getting number of words in it: ");
   a=sc.nextLine();
    int cnt=0;
    Stream<String> stream=Arrays.stream(a.split(" +"));
    System.out.println(stream.count());
   
   //Question 3

    Map<String,Integer> map1=new HashMap<String,Integer>();
    int number;
    System.out.print("Enter the number of key value pairs for input: ");
    number=sc.nextInt();
    System.out.print("Enter the Key Values with space between: ");

    for(int i=0;i<number;i++){
      String inp1;
      int i1;
      inp1=sc.next();
      i1=sc.nextInt();
      map1.put(inp1,i1);
    }
    
    map1.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue()).forEach(System.out::println);

    // Question 4
        
    List<Employee> list=new ArrayList<Employee>();
    int number1;
    System.out.print("Enter the number of Employees for input: ");
    number1=sc.nextInt();
    System.out.print("Enter the Employee  names  and thier IDs with space between: ");
    for(int i=0;i<number1;i++){
        String inp1;
      int i1;
      inp1=sc.next();
      i1=sc.nextInt();
      list.add(new Employee(inp1,i1));
    }
    List<Employee> Ans=list.stream().sorted((Employee e1, Employee e2)->e1.name.compareTo(e2.name)).collect(Collectors.toList());
    for(Employee e:Ans){
        System.out.println(e.name);
    }

   }

   
}