import java.util.Scanner;

public class QN24 {
    public static void main(String[] args) {
        boolean flag = true;
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        while (flag) {
            System.out.print("Enter your number: ");
            int num = sc.nextInt();

            if (num < 0) {
                flag = false;
                System.out.println("Canceling the operation! Your accumulated sum is: " + sum);
                break;
            }

            sum = sum + num;

            System.out.println("The accumulated sum upto now is: " + sum);
        }
    }
}
