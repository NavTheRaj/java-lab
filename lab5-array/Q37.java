import java.util.Arrays;

public class Q37 {
    public static int getMaxDifferece(int[] arr) {
        int maxDiff = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] - arr[i] > maxDiff) {
                    maxDiff = arr[j] - arr[i];
                }
            }
        }
        return maxDiff;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 7, 9, 5, 11, 3, 5, 0 };
        System.out.println("Array: " + Arrays.toString(arr));
        int maxDifference = getMaxDifferece(arr);
        System.out.println("The maximum difference is: " + maxDifference);
    }
}