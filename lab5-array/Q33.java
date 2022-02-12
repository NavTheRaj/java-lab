import java.util.Arrays;

public class Q33 {
    static void sortBinary(int[] arr) {
        int[] temp = new int[arr.length];
        int firstIdx = 0;
        int lastIndex = arr.length - 1;

        for (int j : arr) {
            if (j == 0) {
                temp[firstIdx++] = 0;
            } else {
                temp[lastIndex--] = 1;
            }
        }

        System.out.println(Arrays.toString(temp));
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 0, 1, 1, 0, 1, 0, 0 };
        System.out.println("Initial Array:\t " + Arrays.toString(arr));
        sortBinary(arr);
    }
}