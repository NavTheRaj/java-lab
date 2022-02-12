import java.util.Scanner;
// Java program that reads in two floating-point numbers and tests whether they
// are the same up to three decimal places

class ComapareFloatingPoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double x = 1.256355;
        double y = 1.25621312;

        x = Math.round(x * 1000);
        System.out.println("x = " + x);
        x = x / 1000;

        y = Math.round(y * 1000);
        System.out.println("y = " + y);
        y = y / 1000;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        if (x == y) {
            System.out.println("They are the same up to three decimal places");
        } else {
            System.out.println("They are different");
        }
    }
}