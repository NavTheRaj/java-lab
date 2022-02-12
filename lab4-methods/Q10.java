import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first character:");
        char ch1 = sc.next().charAt(0);
        System.out.println("Enter second character:");
        char ch2 = sc.next().charAt(0);
        displayCharacters(ch1, ch2);
        sc.close();
    }

    static void displayCharacters(char ch1, char ch2) {
        int count = 0;
        char ch;
        System.out.println("----------------------------------------");
        for (int i = ch1; i <= ch2; i++) {
            ch = (char) i;
            count++;
            System.out.print(ch + " ");
            if (count % 20 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n----------------------------------------");
    }
}