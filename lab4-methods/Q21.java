import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        String str1 = "Ramayan";
        String str2 = "Ram";
        System.out.println(checkSubstring(str1, str2));
    }

    public static String checkSubstring(String str1, String str2) {
        String major = (str1.length() > str2.length()) ? str1 : str2;
        String minor = (str1.length() > str2.length()) ? str2 : str1;

        System.out.println(major.indexOf(minor));

        if (major.contains(minor)) {
            return "Substring is present in the string";
        } else {
            return "Substring is not present in the string";
        }

    }
}