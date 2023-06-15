import java.util.Scanner;
public class Table {
    public static void printTable(int N){
    for (int i = 1; i <= 10; i++) {
        
            System.out.println(N + " * " + i + " = "
                               + N * i);
    }   
}
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.println("enter N");
        N = sc.nextInt();
        System.out.println("table of "+N+" upto 10 numbers are");
        printTable(N);
    } 
       
}

