import java.util.*;
class Solution

{

public static HashMap<String, Float> sortByValue(HashMap<String, Float> hm)

  {

       List<Map.Entry<String, Float> > list =

              new LinkedList<Map.Entry<String, Float> >(hm.entrySet());

 

       Collections.sort(list, new Comparator<Map.Entry<String, Float> >() {

          

           public int compare(Map.Entry<String, Float> o1,

                             Map.Entry<String, Float> o2)

           {

               return (o2.getValue()).compareTo(o1.getValue());

           }

       });

        

 

       HashMap<String, Float> temp = new LinkedHashMap<String, Float>();

       for (Map.Entry<String, Float> aa : list) {

           temp.put(aa.getKey(), aa.getValue());

       }

       return temp;

  }

}

 

public class sort

{

  public static void main(String[] args)

  {

       Scanner sc=new Scanner(System.in);

Solution S=new Solution();

       System.out.println("Enter the size of array: ");

       int n=sc.nextInt();

       System.out.println("Enter elements of array: ");

       String[] str=new String[n];

       for(int i=0;i<n;i++)

       {

           str[i]=sc.next();

       }

      

       HashMap<String,Float> hm=new HashMap<String,Float>();

       for(int i=0;i<n;i++)

       {

          hm.put(str[i],Float.parseFloat(str[i]));

       }

       hm=S.sortByValue(hm);

       Iterator <String> it = hm.keySet().iterator();

       while(it.hasNext()) 

       { 

           String key=it.next(); 

           System.out.println(key); 

       } 

      

  }

}