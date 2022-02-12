// Write a program in Java to display n terms of natural numbers and their sum.

public class NaturalNums {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("Sum of first " + n + " natural numbers is " + sum);
    }
}
