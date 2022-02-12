public class CompareByLast {
    // Write a Java program that reads in two integer numbers and tests whether they
    // are the same up
    // to n position starting from the least position, n input by user.
    public static void main(String[] args) {
        int num1 = 123424256;
        int num2 = 3257;
        int n = 3;
        int converter = 1;
        for (int i = 0; i < n; i++) {
            converter *= 10;
        }
        int lastNum1 = num1 % converter;
        int lastNum2 = num2 % converter;
        if (lastNum1 == lastNum2) {
            System.out.println("They are same.");
        } else {
            System.out.println("They are different.");
        }

    }
}