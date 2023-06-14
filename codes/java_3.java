package NetSkills_Demo.codes;
public class java_3 {
    public static void main(String[] args) {
        int []arr = new int[] {4,1,6,3,8,9};
        int n=arr.length;
        int max1=arr[0];
        int max2=0,max3=0;
        for(int i=1;i<n;i++) {
            if (arr[i]>max1) {
                max3=max2;
                max2=max1;
                max1=arr[i];
            }
        }
        System.out.println(max3);
    }

}
