import java.util.*;
import java.lang.*;
public class error2
{
    public static void main(String args[])
    {
        String[] values={"20","0.12","200.00","0","122","1200"};
        int v=values.length;
        String[] ans =new String[v];
        SortedMap<Float, Integer> sm = new TreeMap<>();
 
        for(int i=0;i<v;i++)
        sm.put(Float.parseFloat(values[i]),i);
        Set s = sm.entrySet();
        Iterator i = s.iterator();
        int k=0;
        while(i.hasNext())
           { Map.Entry m = (Map.Entry)i.next();
            int value = (Integer)m.getValue();
            ans[k++]=values[value];}

        for(int f=0;f<v;f++)
        {
            System.out.println(ans[f]);
        }    

    }
    }
