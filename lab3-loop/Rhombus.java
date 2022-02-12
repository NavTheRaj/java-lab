public class Rhombus {
    public static void main(String[] args) {

        int i, j, k, l;

        int rows = 4;

        System.out.println("Printing Diamond Number Pattern");

        for (i = 1; i <= rows; i++) {
            // Space determination
            for (j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // First Half
            for (k = i; k >= 1; k--) {
                System.out.print(k);
            }

            // Second Half
            for (l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
