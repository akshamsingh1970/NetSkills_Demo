import java.util.*;
import java.lang.*;

@FunctionalInterface
interface MyInterface{
    void solve();
}

class Main{
    public static void main(String args[]){
        MyInterface mi = ()->{
            int[] arr = {1,2,3,4,5,6,7,8};

            int mini, submini, maxi, submaxi;
            mini = submini = Integer.MAX_VALUE; 
            maxi = submaxi = Integer.MIN_VALUE; 

            for(int x: arr){
                if(maxi <= x){
                    submaxi = maxi;
                    maxi = x;
                }else if(submaxi <= x){
                    submaxi = x;
                }

                if(mini >= x){
                    submini = mini;
                    mini = x;
                }else if(submini >= x){
                    submini = x;
                }
            }

            System.out.print("Second Max: "+submaxi+" Second Min: "+submini);
        };

        mi.solve();
    }
}