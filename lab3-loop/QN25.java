import java.util.Scanner;

public class QN25 {
    public static void main(String[] args) {
        int PIN = 1234;
        int attempts = 0;
        int totalAttempts = 3;
        int remainingAttempts = totalAttempts - attempts;

        Scanner sc = new Scanner(System.in);

        while (attempts != 3) {
            attempts++;
            remainingAttempts = totalAttempts - attempts;

            System.out.print("Enter PIN: ");
            int inputPin = sc.nextInt();

            if (inputPin == PIN) {
                System.out.println("Correct PIN Number!");
                break;
            } else {
                System.out.println("Sorry, your PIN is incorrect. You have "
                        + remainingAttempts +
                        " attempts left.");
            }

        }
    }
}
