package NetSkills_Demo.vinay;

public class printTables {
    public static void main(String[] args) {
        // Printing tables
        for(int i = 2; i < 6; i++) {
            System.out.print("\n");
            System.out.println(i + " table:");
            printTable(i);
        }
    }

    public static void printTable(int n) {
        for(int i = 1; i <= 10; i++) {
            int val = n * i;
            System.out.print(n + " X " + i + " = " + val);
            System.out.println("");
        }
    }
}
