import java.util.Arrays;

public class Q15 {
    public static void main(String[] args) {
        // Write a Java Program to add two matrices of the same size.
        int[][] matrix1 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[][] matrix2 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int rows = matrix1.length;
        int cols = matrix1[0].length;

        int[][] result = new int[rows][cols];

        // Sum of two matrix
        for (int i = 0; i < rows; i++) { // i = 0
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Display the result
        // System.out.println(Arrays.deepToString(result));
        for (int[] i : result) {
            System.out.println(Arrays.toString(i));
        }

        // int[] arr = { 1, 2, 3 };
        // for (int i : arr) {
        // System.out.println(arr[i]);
        // }

    }
}
