import java.util.Arrays;

public class Q17 {
    public static void main(String[] args) {
        // Transpose a matrix
        int[][] matrix = {
                { 1 },
                { 2 },
                { 3 } };
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] result = new int[cols][rows]; // 1 * 3

        // Transpose of matrix
        for (int i = 0; i < rows; i++) { // 0
            for (int j = 0; j < cols; j++) { // [i][j] = Value
                System.out.println(
                        "Original Index: " + i + " " + j + " => " + matrix[i][j] + " | Result Index: " + j + " " + i);
                result[j][i] = matrix[i][j]; // result[0][1] = matrix[1][0]

            }
        }

        // Display the result
        // System.out.println(Arrays.deepToString(result));
        for (int[] i : result) {
            System.out.println(Arrays.toString(i));
        }
    }
}
