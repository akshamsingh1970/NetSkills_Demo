public class sort {
    public static void main(String[] args) {

        String[] str = {"-100", "50", ".12", "0.12", "0", "000.000"};
        float[] arr = new float[str.length];
        float temp;
        String t;
        for (int i=0; i<str.length; i++) {
            arr[i] = Float.parseFloat(str[i]);
            // System.out.print(arr[i]+" ");
        }

        for (int i=0;i<str.length;i++) {
            for (int j=i+1;j<str.length;j++) {
                if (arr[i]<arr[j]) {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    t=str[i];
                    str[i]=str[j];
                    str[j]=t;
                }
            }
        }

        for (int i=0; i<str.length; i++) {
            System.out.print(str[i]+" ");
        }
    }
}