public class Q19 {

    public static void reverseString(String s) {
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        System.out.println(reverse);
    }

    public static void main(String[] args) {
        // Reverese a string
        String s = "WoW KayaK RotatoR RacecaR";
        reverseString(s);
    }
}
