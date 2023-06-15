import java.util.*;
class NewProblem{
    public static void main(String args[]){
        System.out.println("enter n");
        int n = sc.nextInt();
        String str[] = new String[n];
        for(int i=0;i<str.length;i++){
            str[i] = sc.nextLine();
        }
        HashMap<String,Float> hm = new HashMap<String,Float>;
        for(int i=0;i<str.length;i++){
            hm.put(str[i],Float.parseFloat(str[i]));
        }
        

    }
}