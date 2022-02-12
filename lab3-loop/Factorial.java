public class Factorial {
    public static void main(String[] args) {
        // Calculate the factorial of a number
        int num = 5;
        int fact = 1;
        for (int i = num; i > 1; i--) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is: " + fact);
    }
}
