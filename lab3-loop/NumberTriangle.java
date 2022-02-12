// Write a program in Java to display the pattern like right angle triangle with a number.

public class NumberTriangle {
    public static void main(String[] args) {
        // Right angle triangle pattern with numbers
        int i, j, k = 0;

        for (i = 1; i <= 5; i++) {
            k = k + 1;
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
