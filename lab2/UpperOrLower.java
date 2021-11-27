class UpperOrLower {
    public static void main(String[] args) {
        char ch = 'x';

        System.out.println("ASCII VALUE => " + (int) ch);
        if (ch >= 65 && ch <= 90) {
            System.out.println("Upper case");

        } else {
            System.out.println("Lower case");
        }
    }
}