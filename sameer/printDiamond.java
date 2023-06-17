public class printDiamond {
    public static void main(String[] args) {
        int n = 6;
        int totalPlaces = n + (n - 1);
        for(int i = 1; i <= n; i++) {
            int spaces = (totalPlaces - i - (i - 1)) / 2;
            for(int k = 0; k < spaces; k++)
                System.out.print(" "); 
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        for(int i = n-1; i >= 1; i--) {
            int spaces = (totalPlaces - i - (i - 1)) / 2;
            for(int k = 0; k < spaces; k++)
                System.out.print(" "); 
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
