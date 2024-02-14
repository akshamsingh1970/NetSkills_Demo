package FunctionalInterfaceQues;

import java.util.ArrayList;

public class q2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<10;i++){
            list.add(i);
        }

        ArrayList<Integer> evenList=new ArrayList<>();
        ArrayList<Integer> oddList=new ArrayList<>();

        evenOdd obj=(ArrayList<Integer> NumbersList) -> {
            for(int i=0;i<NumbersList.size();i++){
                if(NumbersList.get(i)%2==0){
                    evenList.add(NumbersList.get(i));
                }
                else{
                    oddList.add(NumbersList.get(i));
                }
            }
        };
        obj.seperate(list);
        System.out.println("Even List");
        for(int i=0;i<evenList.size();i++){
            System.out.println(evenList.get(i));
        }

        System.out.println("Odd List");
        for(int i=0;i<oddList.size();i++){
            System.out.println(oddList.get(i));
        }

         


    }
}
interface evenOdd{
    public void seperate(ArrayList<Integer> list);
}
