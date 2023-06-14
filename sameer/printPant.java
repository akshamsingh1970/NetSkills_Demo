public class printPant {
    public static void main(String[] args) {
        int n = 9; // Odd number only
        for(int i = 0; i < n; i++)
            System.out.print("*");
        System.out.print("\n");

        int starsPerLine = n - 1;
        int spaces = 1;
        while(starsPerLine >= 2) {
            int oneSideStars = starsPerLine / 2;
            for(int i = 0; i < oneSideStars; i++)
                System.out.print("*");
            for(int i = 0; i < spaces; i++)
                System.out.print(" ");
            for(int i = 0; i < oneSideStars; i++)
                System.out.print("*");
            spaces += 2;
            starsPerLine -= 2;
            System.out.print("\n");
        }
    }
}
