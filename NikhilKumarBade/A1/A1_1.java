import java.util.*;

class ReverseString{
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter string");
        String str = s.nextLine();
        String str1="";
        System.out.println("Reverse string is ");
        for(int i=str.length()-1;i>=0;i--)
        {
            str1=str1+str.charAt(i);
        }
        System.out.println(str1);
    }
}