// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("String Input");

        String inpString = myObj.nextLine();


        String sol = "";
        for (int i = 0; i < inpString.length(); i++) {
            sol += (inpString.charAt(inpString.length()-i-1));
        }

        System.out.println("Reversed string is: " + sol);
    }
}