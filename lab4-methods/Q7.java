public class Q7 {

    public static int countWords(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }

        return count + 1;

    }

    public static void main(String[] args) {
        // Count words in a string
        String s = "Nepal is a beautiful country";
        int count = countWords(s);
        System.out.println("Number of words in : [ " + s + " ] is " + (count + 1));

    }
}
