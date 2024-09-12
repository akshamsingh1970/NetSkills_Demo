public class prob11 {
    public static void main(String[] args) {
        for(int i = 6; i > 0; i--)  {
            for(int j = i; j < 6; j++)  
                System.out.print("* ");
            for(int j = i; j > 1; j--)  
                System.out.print("  ");
            for(int j = i; j > 1; j--)  
                System.out.print(" ");
            for(int j = i; j < 6; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
