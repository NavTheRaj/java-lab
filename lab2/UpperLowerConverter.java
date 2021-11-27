class UpperLowerConverter {
    public static void main(String[] args) {
        char ch = 'x';

        System.out.println("ASCII VALUE => " + (int) ch);

        System.out.println("Before  => " + ch);

        if (ch >= 65 && ch <= 90) {
            System.out.println("Upper case");
            ch = Character.toLowerCase(ch);

        } else {
            System.out.println("Lower case");
            ch = Character.toUpperCase(ch);
        }

        System.out.println("After  => " + ch);
    }
}