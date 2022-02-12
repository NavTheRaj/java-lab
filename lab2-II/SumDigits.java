// Program to sum the three digit number in java
class SumDigits {
    public static void main(String[] args) {
        int num, sum = 0;
        num = 123;
        while (num != 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println("Sum of digits is " + sum);
    }
}