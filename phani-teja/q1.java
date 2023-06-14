public class q1 {
    public static void main(String args[]) {
        String original = "tomato";
        String reversed = reverse(original);
        System.out.println("Q1: "+reversed);
        prime(0, 20);
        tables(2, 5);
        System.out.println("\nQ4");
        eo(1, 20);
        System.out.println("\nQ5");
        System.out.println(get_percentage(89));
        System.out.println("\nQ6");
        System.out.println(fact(8));
        System.out.println("\nQ7");
        swapAndPrint(5,10);
        System.out.println("\nQ8");
        boolean leap = checkLeapYear(1990);
        if (leap){
            System.out.println("2000 Leap Year");
        } else{
            System.out.println("Not a Leap Year");
        }
        System.out.println("\nQ9");
        diamond(6);
        System.out.println("\nQ10");
        pantPattern(5);
        System.out.println("\nQ11");
        reversePantPattern(5);
        System.out.println("\nQ12");
        System.out.println(""+thirdMax());

    }

    public static String reverse(String original) {
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            // System.out.println(i);
            reversed += original.charAt(i);
        }
        return reversed;
    }

    public static void prime(int start, int end) {
        System.out.println("\nQ2");
        for (int i = start; i <= end; i++) {
            if (i == 0 || i == 1) {
                continue;
            }
            int flag = 0;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {

                    flag = 1;
                    break;

                }

            }

            if (flag == 0) {
                System.out.println(i);

            }

        }
    }

    public static void tables(int start, int end) {
        System.out.println("\nQ3");
        for (int i = start; i <= end; i++) {
            System.out.println("Table " + i);
            int val = i;
            for (int j = 1; j <= 10; j++) {
                System.out.println(val + " x " + j + " = " + val * j);
            }
        }
    }

    public static void eo(int start, int end) {
        System.out.println("Even");
        for (int i = start; i <= end; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Odd");
        for (int i = start; i <= end; i++) {

            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static String get_percentage(int marks){
        if (marks<35){
            return "fail";
        }
        else if (marks <45){
            return "Third class";
        }
        else if (marks<55){
            return "Second Class";
        }
        else if (marks<66){
            return "First class";
        }
        else{
            return "Distinction";
        }
    }

    public static int fact(int num){
        int out = 1;
        for (int i=num;i>0;i--){
            out *= i;
        }

        return out;
    }

    public static void swapAndPrint(int a, int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("A: "+a+"\tB: "+b );
    }

    public static boolean checkLeapYear(int year){
        if (year%400 == 0){
            return true;
        }
        if (year%4 == 0 && year%100 !=0){
            return true;
        }
        return false;
    }

    static void diamond(int n){
        pyramid(n);
        reversePyramidWithOneSpaceIndent(n-1);
    }

    static void reversePyramidWithOneSpaceIndent(int n){
        for (int i =0; i<n;i++){
            
            for(int j = i+1;j>=1;j--){
                System.out.print(" ");
            }

            for(int k=n;k>i;k--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static void pyramid(int n){
        for (int i =0; i<n;i++){
            
            for(int j = n-i;j>1;j--){
                System.out.print(" ");
            }

            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pantPattern(int n){
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("* " );
            }
            for(int k=n-i;k>0;k--){
                System.out.print("  ");
            }
            for(int j = n-i;j>=1;j--){
                System.out.print(" ");
            }

            for(int k=0;k<i;k++){
                System.out.print("* ");
            }
        System.out.println();
        }
    }

    static void reversePantPattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=n-i;k>1;k--){
                System.out.print("  ");
            }
            for(int j = n-i;j>1;j--){
                System.out.print(" ");
            }

            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static int thirdMax(){
        int[] arr = {22,100,44,11,22,100,77,44,11};
        int first=0,second=0,third = 0;
        for(int i:arr){
            if (i==first || i==second || i==third){
                continue;
            }
            if (i>first){
                third = second;
                second = first;
                first = i;
                continue;
            }
            if (i>second){
                third = second;
                second = i;
                continue;
            }
            if (i>third){
                third = i;
                continue;
            }
        }
        return third;

    }

}
