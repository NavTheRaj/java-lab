public class BinaryTriangle {
    public static void main(String[] args) {
        int i, j;

        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                int displayNum = ((i + j) % 2 == 1) ? 0 : 1;
                System.out.format("%-2d", displayNum);
            }
            System.out.println();
        }

    }
}
