import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of m:");
        int m = sc.nextInt();
        System.out.println("Enter value of n:");
        int n = sc.nextInt();
        System.out.println("Calculated result: " + power(m, n));
        System.out.println("Calculated result: " + power(m));
        sc.close();
    }

    static int power(int m, int n) {
        return (int) Math.pow(m, n);
    }

    static int power(int m) {
        return (int) Math.pow(m, 2);
    }
}