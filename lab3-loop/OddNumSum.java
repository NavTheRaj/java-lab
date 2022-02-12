import java.util.Scanner;

//Write a program in Java to display the n terms of odd natural number and their sum.

public class OddNumSum {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        n = sc.nextInt();
        System.out.println("------------------------------");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                sum = sum + i;
            }
        }
        System.out.println("------------------------------");
        System.out.println("The sum of odd natural number is " + sum);
    }
}
