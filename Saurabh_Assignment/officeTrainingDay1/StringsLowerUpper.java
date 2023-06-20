
import java.util.*;
import java.util.stream.*;
import java.util.Scanner.*;

@FunctionalInterface
interface MyInterface {
    public void solve();
}

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        MyInterface mi = ()->{
            System.out.print("Enter no of elts: ");
            int n = sc.nextInt();

            List<String> list = new ArrayList<String>();
            System.out.print("Enter elts: ");
            
            for(int i=0; i<n; i++){
                String str = sc.next();
                list.add(str);
            }

            List<String> res = list.stream().map(item -> item.toUpperCase()).collect(Collectors.toList());

            System.out.println(res);
        };

        mi.solve();
    }
}