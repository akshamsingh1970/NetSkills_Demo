import javax.annotation.processing.SupportedSourceVersion;
import javax.print.attribute.standard.NumberOfInterveningJobs;
import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

interface Factorial{
    long factorial(int x);
};

interface PerfectSquare{
    Boolean perfectSqr(int x);
};

interface smallestElem{
    void findElements(List<Integer> lst);
};

interface removeDuplicates{
    List<Integer> DuplicateRemove(List<Integer> nums);
};

interface eveOdd{
    void evenOdOdd(List<Integer> lst);
}

interface upperLower{
    void UpLowcase(List<String> lst);
}

public class StringsPractice {

    public static void main(String []args) {
        Factorial fact = (a) -> {
            long num = 1;
            for (int i = 2; i <= a; i++) {
                num *= i;
            }
            return num;
        };

        int n = 8;
        int b = 10;

        System.out.println("Factorial of "+n+" is: "+ fact.factorial(n));

        PerfectSquare sqr = (a) -> {
            Boolean newBool = false;
            int num = (int) Math.sqrt((double) a);
            int diff = num * num - a;
            if (diff == 0) {
                newBool = true;
            }
            return newBool;
        };

        Boolean bool = sqr.perfectSqr(b);

        if (bool) {
            System.out.println(b+ " is a Perfect number");
        } else {
            System.out.println(b+ " is NOT a perfect number");
        }
        List<Integer> newlst = new ArrayList<Integer>();
        List<Integer> numList = new ArrayList<Integer>();
        List<Integer> eveLst = new ArrayList<Integer>();
        int SZ = 10;
        for(int i=0;i<SZ;i++){
            int add = (int)(Math.random()*(200-50) + 50);
            newlst.add(add);
            numList.add(add);
            numList.add(add);
            eveLst.add(add);
        }
        smallestElem sml = (lst) -> {
            int small2 = Integer.MAX_VALUE;
            int small = Integer.MAX_VALUE;
            int len = lst.size();
            for(int i=0;i<len;i++){
                int elem = lst.get(i);
                if(elem < small){
                    small2 = small;
                    small = elem;
                }
                else if(elem < small2){
                    small2 = elem;
                }
            }

            System.out.println(lst);
            System.out.println("Second smallest element is: "+small2);
            System.out.println("Smallest element is: "+small);
        };

        sml.findElements(newlst);

        removeDuplicates rm = (nl)->{
            int len = nl.size();
            int idx = 0;
            List<Integer> cplst = new ArrayList<Integer>();
            for(int i=0;i<len;i++){
                if(!cplst.contains(nl.get(i))){
                    cplst.add(nl.get(i));
                }
            }
            return cplst;
        };

        System.out.println("Array with duplicates: "+numList);
        numList = rm.DuplicateRemove(numList);
        System.out.println("Array without duplicates: "+numList);

        System.out.println();

        eveOdd evd = (lst)->{
            List<Integer> even = new ArrayList<Integer>();
            List<Integer> odd = new ArrayList<Integer>();
            int len = lst.size();
            for(int i=0;i<len;i++){
                int elem = lst.get(i);
                if(elem%2 == 0){
                    even.add(elem);
                }
                else {
                    odd.add(elem);
                }
            }
            System.out.println("Initial list is: "+lst);
            System.out.println("Even numbers are: "+even);
            System.out.println("Odd numbers are: "+odd);
        };

        evd.evenOdOdd(eveLst);
    }

//    List<String> str = new ArrayList<String>();
//    str.add("");
//
//    upperLower upL = (lst)->{
//        //
//    };
}
