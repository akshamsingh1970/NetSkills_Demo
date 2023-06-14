import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Input number");

        int inp = myObj.nextInt();
        int sol;
        for(int i=1;i<=10;i++) {
            sol = i*inp;
            System.out.println(inp + "*" + i + "=" + sol);
        }
    }
}