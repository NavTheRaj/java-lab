public class Pyramid {

    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // int k = 0; // reset k to 0 after each row
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("   "); // Printing spaces
            }

            // Counting the number of stars in each row
            for (int k = 0; k != 2 * i - 1; ++k) {
                System.out.print(" " + i + " ");
                // ++k;
            }
            System.out.println();
        }

    }
}