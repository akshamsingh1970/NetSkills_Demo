public class sortString {
    public static void main(String[] args) {
        String[] str = {"-100", "50", ".12", "0.12", "0", "000.000"};
        double[] val = new double[str.length];
        for(int i = 0; i < str.length; i++) {
            val[i] = Double.parseDouble(str[i]);
        }

        for (int i = 0; i < val.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < val.length; j++){  
                if  (val[j] < val[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            double smallerNumber = val[index];   
            val[index] = val[i];  
            val[i] = smallerNumber;  

            String smallerString = str[index];
            str[index] = str[i];
            str[i] = smallerString;
        }  

        for(int i = str.length-1; i>=0;i--)
            System.out.println(str[i]);

    }
}