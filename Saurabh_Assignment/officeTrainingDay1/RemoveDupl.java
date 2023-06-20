import java.util.*;
import java.util.stream.*;

@FunctionalInterface
interface MyInterface{
    void solve();
}

class Main{
    public static void main(String args[]){
        MyInterface mi = ()->{
            List<Integer> list = new ArrayList<Integer>();
            // 1,2,3,4,3,5,6,7,2,4,6,3
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(3);
            list.add(5);
            list.add(6);
            list.add(7);
            list.add(2);
            list.add(4);
            list.add(6);
            list.add(3);
            List<Integer> ans = list.stream().distinct().collect(Collectors.toList());
            // List<Integer> ans = new ArrayList<Integer>();
            // for(int i=0; i<sortedList.size(); i++){
            //     ans.add(sortedList.get(i));
            //     int j=i+1;
            //     while(j<sortedList.size() && sortedList.get(j) == sortedList.get(i)){
            //         j++;
            //     }
            //     i = j-1;
            // }

            System.out.println(ans);
        };

        mi.solve();
    }
}