public class Q16 {
    public static void checkPalindrome(int num) {
        int temp = num;
        int reverse = 0;
        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        if (num == reverse) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }
    }

    public static void main(String[] args) {
        int num = 121;
        checkPalindrome(num);
    }
}
