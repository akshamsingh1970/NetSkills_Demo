
import java.util.Scanner;

public class reverseString {

    public static void main(String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();

        char[] charArray = str.toCharArray();
        int len = charArray.length;
        int i = 0,j=len-1;
        while(i<j)
        {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;

            i++;
            j--;

        }
        str = new String(charArray);
        System.out.println(str);

    }
}
