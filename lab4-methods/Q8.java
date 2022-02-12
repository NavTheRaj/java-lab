public class Q8 {

    public static int getSumOfDigits(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 12345;
        int temp = num;
        int sum = getSumOfDigits(temp);
        System.out.println("Sum of digits in " + num + " is " + sum);
    }
}
