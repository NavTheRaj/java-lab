// Program to find if a given character is digit or letter

class CharOrDigit {
    public static void main(String[] args) {
        char ch = '6';

        /* 65 --> 90 --> A --> Z */
        /* 97 --> 122 --> a --> z */
        /* 48 --> 57 --> 0(Zero) --> 9(Nine) */

        if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
            System.out.println(ch + " is a Letter");
        } else if (ch >= 48 && ch <= 57) {
            System.out.println(ch + " is a Digit");
        } else {
            System.out.println(ch +
                    " is neither letter nor a digit");
        }
    }
}