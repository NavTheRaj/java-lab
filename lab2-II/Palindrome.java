// Program to check three digit number is palindrome or not
class Palindrome {
    public static void main(String[] args) {
        int num, rev = 0, temp = 0, rem = 0;
        num = 323;
        temp = num;

        while (temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if (rev == num) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
