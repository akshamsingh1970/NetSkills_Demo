
public class StringFormatter {  
    
    public static void main(String[] args){
        String input="Hello JavaTpoint";
        String reversed=reverseString(input);
        System.out.println(reversed);
    }
    
    
    
public static String reverseString(String str){  
 StringBuilder sb= new StringBuilder();
 for(int i=str.length()-1;i>=0;i--){
     sb.append(str.charAt(i));
 }
 return sb.toString();
}  

} 




