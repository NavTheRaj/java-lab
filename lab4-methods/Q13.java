import java.util.Random;
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = sc.nextInt();
        sc.close();
        printMatrix(n);

    }

    public static void printMatrix(int n) {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(random.nextInt(2) + " ");
            System.out.println();
        }
    }
}