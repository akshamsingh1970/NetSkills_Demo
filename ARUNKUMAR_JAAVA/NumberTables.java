public class NumberTables {
    public static void printTable(int number) {
        System.out.println("Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        for (int i = 2; i <= 5; i++) {
            printTable(i);
        }
    }
}