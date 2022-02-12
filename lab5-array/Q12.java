import java.util.Arrays;

public class Q12 {
    public static void main(String[] args) {
        // Common elements in two integers
        int[] items1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] items2 = { 1, 2, 3, 4, 5 };

        int len1 = items1.length;
        int len2 = items2.length;
        for (int i = 0; i < len1; i++) { // item1[1] = 2
            for (int j = 0; j < len2; j++) { // item2[1] = 2
                if (items1[i] == items2[j]) {
                    System.out.println(items1[i]);
                }
            }
        }

    }
}
