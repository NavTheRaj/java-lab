// Write a program in Java to make such a pattern like right angle triangle with number increased
// by 1

public class FloydTraingle {
    public static void main(String[] args) {
        // pattern like right angle triangle with number increased by 1
        int i, j, k = 1;
        for (i = 1; i <= 5; i++) {

            for (j = 1; j <= i; j++) {

                System.out.format("%-5d", k++);

            }
            System.out.println();
        }

    }
}
