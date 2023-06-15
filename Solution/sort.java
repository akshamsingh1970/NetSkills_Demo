import java.io.*;

import java.util.*;

// import java.lang.*;

// import javafx.util.Pair;

class MyPair

{

    private  Double key;

    private Integer value;




    public MyPair(Double aKey, Integer aValue)

    {

        key   = aKey;

        value = aValue;

    }




    public Double Key()   { return key; }

    public Integer Value() { return value; }

}

class Sortbykey implements Comparator<MyPair> {

    public int compare(MyPair a, MyPair b)

    {

        return Double.compare(a.Key(),b.Key());

    }

}

class Sorting{

 public void SortStringArray(String[] arr,int n){

              

            MyPair[] p=new MyPair[n];

            String[] ans=new String[n];

            for(int i=0;i<n;i++){

             p[i]=new MyPair(Double.parseDouble(arr[i+1]),i+1);

            }

            Arrays.sort(p,new Sortbykey());

            int j=0;

            for(int i=n-1;i>=0;i--){

                ans[j++]=arr[p[i].Value()];

            }

            for(int i=0;i<n;i++){

                System.out.print(ans[i]+" ");

            }

            System.out.println();

}

}

public class sort{

    public static void main(String[] ab){


        Scanner sc=new Scanner(System.in);

        int n;

        System.out.print("Enter the size of the Array: ");

        n=sc.nextInt();

        String [] arr=new String[n+1];

        System.out.print("Enter the Elements of the Array: ");

        for(int i=0;i<n+1;i++){

            arr[i]=sc.nextLine();       

            System.out.println(arr[i]+ " "+i);

            }
            sc.close();
        Sorting s=new Sorting();

       s.SortStringArray(arr,n);

    }

}
