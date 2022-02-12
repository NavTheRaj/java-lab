// Get last three digit from a number

class EqualUptoThreeDigits {
    public static void main(String[] args) {
        int num1 = 12345;
        int num2 = 589784345;
        num1 = num1 % 1000;
        num2 = num2 % 1000;
        System.out.println(num1 == num2);
    }
}