public class Q13 {
    public static void main(String[] args) {
        // Write a Java Program to find the second largest element in an array.
        int[] items = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int len = items.length;

        int max = items[0];

        for (int i = 0; i < len; i++) {
            if (items[i] > max) {
                max = items[i];
            }
        }

        int secondMax = items[0];

        for (int i = 0; i < len; i++) {
            if (items[i] > secondMax && items[i] < max) {
                secondMax = items[i];
            }
        }

        System.out.println(secondMax);

    }
}
