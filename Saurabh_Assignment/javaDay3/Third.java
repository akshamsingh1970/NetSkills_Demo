/*
3-> Write a program to sort the given array of String in descending order. Your string value should be the same during the output. Like- .12 printed as .12 and 0.12 printed as 0.12
Ex-> String[] str = {“-100”,”50”,”.12”,”0.12”,”0”,”000.000”};
*/
import java.util.*;
import java.lang.*;

class MeraPair{
    Double key;
    int idx;

    MeraPair(){
        key = 0.0;
        idx = -1;
    }

    MeraPair(Double k, int i){
        key = k;
        idx = i;
    }

    public Double getKey(){
        return key;
    }

    public int getIdx(){
        return idx;
    }
}

class MyComp implements Comparator<MeraPair>{
    public int compare(MeraPair mp1, MeraPair mp2){
        // direct comparison
        return Double.compare(mp2.getKey(), mp1.getKey());
    } 
}

class Third{
    public static void main(String args[]){
        String[] str = {"-100","50",".12","0.12","0","000.000"};
        MeraPair[] mpArr = new MeraPair[str.length];

        for(int i=0; i<str.length; i++){
            mpArr[i] = new MeraPair(Double.parseDouble(str[i]), i);
        }

        Arrays.sort(mpArr, new MyComp());

        System.out.println("Array sorted: ");
        for(int i=0; i<str.length; i++){
            System.out.print(str[mpArr[i].getIdx()]+" ");
        }
        System.out.println();// ommiting it would lead to a % char printed at EOL ?
    }
}