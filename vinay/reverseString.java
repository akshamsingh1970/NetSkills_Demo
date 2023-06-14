package NetSkills_Demo.vinay;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter string to reverse:");

        String str = inputObj.nextLine();  // Read user input

        // Reversing a string
        System.out.println("Original string: "+ str);
        System.out.println("Reversed String: "+ revStr(str));
    }

    public static String revStr(String str) {
        String revStr = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            revStr += str.charAt(i);
        }

        return revStr;
    }
}
