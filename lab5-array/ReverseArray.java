import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] reverseArr = new int[arr.length];
        int index = 0; // New array index starting from 0 for reverseArr
        for (int i = arr.length - 1; i >= 0; i--) { // Traversing array
            reverseArr[index] = arr[i]; // from last index to first
            index++;
        }

        System.out.println("Reverse Array: " + Arrays.toString(reverseArr));
    }
}
