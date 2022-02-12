import java.util.Scanner;

public class QN30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two floating number: ");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        System.out.println("Enter the precision point: ");
        int n = sc.nextInt();
        int multiplier = 1;
        for (int i = 0; i < n; i++) {
            multiplier = multiplier * 10;
        }
        float duplicate_num1 = (int) (num1 * multiplier);
        float dumplicate_num2 = (int) (num2 * multiplier);
        if (duplicate_num1 == dumplicate_num2) {
            System.out.println("They are same.");
        } else {
            System.out.println("They are different.");
        }
        sc.close();
    }
}
