public class swap {

    public static void main(String[] args) {
        int rows = 5; // Number of rows in the inverted pyramid

        // Create a 2D matrix to hold the pattern
        char[][] pattern = new char[rows][2 * rows - 1];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < 2 * rows - 1; j++) {
                pattern[i][j] = '*';
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = i; j < 2 * rows - 1 - i; j++) {
                pattern[i][j] = ' ';
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < 2 * rows - 1; j++) {
                System.out.print(pattern[i][j]);
            }
            System.out.println();
        }
    }
}
