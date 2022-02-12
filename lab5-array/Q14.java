import java.util.Arrays;
import java.util.Scanner;

public class Q14 {

    // Method to print matrix
    public static void displayMatrix(int[][] data) {
        int rows = data.length;
        int cols = data[0].length;

        System.out.println("------------------");
        // Print result array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%-5d", data[i][j]);
            }
            System.out.println();
        }
        System.out.println("------------------");
    }

    public static int[][] sumEachRowAndCols(int[][] a, int rows, int cols) {
        int sumRow = 0;
        int sumCol = 0;
        int totalSum = 0;
        int result[][] = new int[rows + 1][cols + 1];

        // Calculates sum of each row of given matrix
        for (int i = 0; i < rows; i++) {
            sumRow = 0; // Update value
            for (int j = 0; j < cols; j++) {
                sumRow = sumRow + a[i][j];
                result[i][j] = a[i][j];
            }
            result[i][cols] = sumRow;
            totalSum = totalSum + sumRow;
        }

        // Calculates sum of each column of given matrix
        for (int i = 0; i < cols; i++) {
            sumCol = 0;
            for (int j = 0; j < rows; j++) {
                sumCol = sumCol + a[j][i];
            }
            result[rows][i] = sumCol;
        }

        // Appending total Sum to the last element in the matrix
        result[rows][cols] = totalSum;

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows, cols;

        // Take input from user
        System.out.print("Rows: ");
        rows = sc.nextInt();
        System.out.print("Columns: ");
        cols = sc.nextInt();

        // {{1,2}
        // ,{3,4}}

        // Initialize a 2D array
        int[][] matrix = new int[rows][cols];

        // int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        // Accept values from user
        System.out.println("Enter values for matrix: ");
        for (int i = 0; i < rows; i++) { // Row fixing 0 1 2 ... limit
            for (int j = 0; j < cols; j++) { // Column fixing 0 1 2 ... limit
                System.out.print("matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print the matrix
        System.out.println("The matrix is: ");
        displayMatrix(matrix);
        // System.out.println(Arrays.deepToString(matrix));

        // Calculates number of rows and columns present in given matrix
        rows = matrix.length;
        cols = matrix[0].length;

        // Calculates sum of each row and column of given matrix
        int[][] result = sumEachRowAndCols(matrix, rows, cols);

        System.out.println("The resultant matrix is: ");
        displayMatrix(result);
        sc.close();

    }

}