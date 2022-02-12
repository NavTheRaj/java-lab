import java.util.Scanner;

public class DecimalCompare {
    // Write a Java program that reads in two floating-point numbers and tests
    // whether they are the
    // same up to n decimal places, n input from user.

    public static void main(String[] args) {
        double a = 1.256355;
        double b = 1.25621355;
        int n = 3;
        double c = a;
        double d = b;
        int count = 0;

        while (c != 0 && d != 0) {
            double lastA = c % 10;
            double lastB = d % 10;
            if (lastA == lastB) {
                count++;
            }
            c = c / 10;
            d = d / 10;
        }
        if (count == n) {
            System.out.println("Same");
        } else {
            System.out.println("Not Same");
        }

    }
}
