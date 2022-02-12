import java.util.Arrays;

public class Q7 {
    public static void main(String[] args) {
        // Write a Java Program to insert an element (specific position) into an array.
        int[] items = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] newItems = new int[items.length + 1];
        int index = 0;
        int insertIndex = 2;
        int itemToInsert = 5;
        for (int i = 0; i < items.length; i++) {
            if (i == insertIndex) {
                newItems[index] = itemToInsert;
                index++;
            }
            newItems[index] = items[i];
            index++;
        }
        System.out.println(Arrays.toString(newItems));

    }
}
