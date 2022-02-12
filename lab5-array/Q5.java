import java.util.Arrays;

// Write a Java Program to remove a specific element from an array.
class Q5 {
    public static void main(String[] args) {
        int[] items = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] newItems = new int[items.length - 1];
        int index = 0;
        int itemToRemove = 5; // enter the item to be removed
        for (int i = 0; i < items.length; i++) {
            if (items[i] != itemToRemove) {
                newItems[index] = items[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(newItems));

    }
}