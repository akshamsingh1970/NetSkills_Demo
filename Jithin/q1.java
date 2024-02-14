public class q1 {
    public static void main(String[] args) {
        String str1="Hello java point";
        char[] str=str1.toCharArray();
        int n=str.length;
        for(int i=0;i<n/2;i++){
            // swap(str[i],str[n-i-1]);
            char temp=str[i];
            str[i]=str[n-1-i];
            str[n-1-i]=temp;
            
        }
        System.out.println(str);
    }
}
