import java.util.Scanner;

class str_reverse{
    public static void main(String[] arg){
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter string");
            String str = s.nextLine();
            String str1="";
            System.out.print("Reverse string is "+" ");
            for(int i=str.length()-1;i>=0;i--)
            {
                str1=str1+str.charAt(i);
            }
            System.out.println(str1);
        }
    }

}