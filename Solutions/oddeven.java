public class oddeven {
    public static void main(String[] args) {
        String odd = "";
        String even = "";
        for(int i=1;i<=20;i++) {
            if (i%2==1)
            odd += i + " ";
            else
            even += i + " ";
        }
    System.out.println("Odd numbers are : "+odd);
    System.out.println("Even numbers are : "+even);
    }
}