import java.util.Scanner;

//Write a program in Java to display the cube of the number up to given an integer.

public class CubeFinder {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");

        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Number is:" + i + " and cube of " + 1 + " is : " + i * i * i);
        }
    }
}
