import java.util.*;
public class day2q3 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        System.out.println("enter array size");
        String[] str=new String[n];
        for(int i=0;i<n;i++)
        {
            str[i]=sc.next();
        }

        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                float x=Float.parseFloat(str[i]);
                float y=Float.parseFloat(str[j]);
                if(x<y)
                {
                    String mid=str[i];
                    str[i]=str[j];
                    str[j]=mid;

                }

            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(str[i]+" ");
        }



    }
}
