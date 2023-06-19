package FunctionalInterfaceQues;

import java.util.ArrayList;

public class q1 {
    public static void main(String[] args) {

        ArrayList<String> str=new ArrayList<>();
        str.add("jithin");
        str.add("NIthin");

        strings obj=(ArrayList<String> s)->{

            for(int i=0;i<s.size();i++){
                System.out.println(s.get(i).toUpperCase());
                System.out.println(s.get(i).toLowerCase());
            }

        };
        obj.toUpperAndLower(str);
        
    }
}
interface strings{
    public void toUpperAndLower(ArrayList<String> s);
}

