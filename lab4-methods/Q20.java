import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string data:");
        String str = sc.next();
        String result = replaceVowels(str);
        System.out.println(result);
        sc.close();
    }

    public static String replaceVowels(String str) {
        String character = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.toLowerCase().charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                character += (char) (str.charAt(i) + 1);
            } else {
                character += (char) (str.charAt(i));
            }
        }
        return "Expected result: " + character;
    }
}