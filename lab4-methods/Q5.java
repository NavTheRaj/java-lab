public class Q5 {

    public static void displayMiddleCharacter(String s) {
        int middle = s.length() / 2;

        if (s.length() % 2 == 0) {
            System.out.println(s.charAt(middle - 1) +
                    "" + s.charAt(middle));
        } else {
            System.out.println(s.charAt(middle));
        }
    }

    public static void main(String[] args) {
        // method to get the middle character of a string
        String odd = "NEPAL";
        String even = "NEPALI";
        displayMiddleCharacter(odd);
        displayMiddleCharacter(even);

    }
}
