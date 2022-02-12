/* Java program to solve quadratic equations (use if, else if and else). */

public class QuadraticEquation {

    public static void main(String[] args) {
        double a, b, c, d, x1, x2;
        a = 1;
        b = -5;
        c = 6;
        // Calculating the discriminant
        d = b * b - 4 * a * c;

        // Checking if discriminant is negative or positive

        // If the discriminant is negative, the equation has no real roots
        if (d < 0) {
            System.out.println("The equation has no real roots");
        }
        // If the discriminant is 0, the equation has one real root
        else if (d == 0) {
            x1 = -b / (2 * a);
            System.out.println("The equation has one real root: " + x1);
        }
        // If the discriminant is positive, the equation has two real roots
        else {
            x1 = (-b + (d * d)) / (2 * a);
            x2 = (-b - (d * d)) / (2 * a);
            System.out.println("The equation has two real roots: " + x1 + " and " + x2);
        }
    }
}
