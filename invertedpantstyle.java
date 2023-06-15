class invertedpantstyle  {  
    public static void main(String[] args)  {  
      int n = 5;


      for(int row = n ; row >= 0 ; row--) {
        // Prints first half of the stars
        for(int col = n ; col > row ; col--) {
          System.out.print("* ");
        }
        
        // Prints space in between
        for(int col = 1 ; col <= 4 * row ; col++) {
          System.out.print(" ");
        }


        // Prints second half of the stars
        for(int col = row + 1 ; col <= n ; col++) {
          System.out.print("* ");
        }


        // Goes to a new line
        System.out.println();
      }
    }  
}