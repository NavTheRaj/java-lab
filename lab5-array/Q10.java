import java.util.Arrays;

public class Q10 {
    public static void main(String[] args) {
        // Write a Java Program to reverse an array of integer values.
        int[] items = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] newItems = new int[items.length];

        for (int i = items.length - 1; i >= 0; i--) {
            newItems[i] = items[i];
        }

        System.out.println(Arrays.toString(newItems));

    }
}
