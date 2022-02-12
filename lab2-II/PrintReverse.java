// Program to reverse three digit number in Java without any loop
class PrintReverse {
    public static void main(String[] args) {
        int number = 123;
        int reverse = 0;
        int remainder = 0;
        int temp = number; // Retaining the original
        // number by assigining it to temp

        while (temp != 0) {
            remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp = temp / 10;
            System.out.println("Remainder =>" + remainder +
                    " Reverse=>" + reverse + " Temp =>" + temp);
        }

        System.out.println("The reverse of " + number +
                " is " + reverse);

        // Palindrome

    }
}