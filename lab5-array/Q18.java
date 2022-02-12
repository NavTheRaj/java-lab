import java.util.Arrays;

public class Q18 {
    public static void main(String[] args) {
        // Write a Java Program that sorts an String array input by user in descending
        // alphabetic
        // order.
        String[] items = { "Ram", "Shyam", "Hari" };

        for (int i = 0; i < items.length; i++) {
            for (int j = i + 1; j < items.length; j++) {
                if (items[i].compareTo(items[j]) < 0) {
                    String temp = items[i];
                    items[i] = items[j];
                    items[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(items));
    }
}
