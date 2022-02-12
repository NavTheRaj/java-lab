import java.util.Random;
import java.util.Scanner;

public class QN26 {
	public static void main(String[] args) {
		// Write a program HighLow.java that implements a simple guessing game High and
		// Low
		int random = (int) (Math.random() * (100 - 1 + 1) + 1);

		Scanner sc = new Scanner(System.in);

		int count = 1;

		while (count <= 10) {
			System.out.print("Guess " + count + ":");
			int guess = sc.nextInt();
			if (guess == random) {
				System.out.println("----------------------------");
				System.out.println("Correct after only " + count + " guesses");
				System.out.println("----------------------------");
				break;
			}

			if (guess < random) {
				System.out.println("Hint: Higher!");
			} else {
				System.out.println("Hint: Lower!");
			}

			if (count == 10) {
				System.out.println("----------------------------");
				System.out.println("Sorry! Better Luck Next Time!");
				System.out.println("----------------------------");
			}
			count++;
		}

	}
}
