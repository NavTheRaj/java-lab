import java.util.Arrays;

public class Q31 {

    static int[] sortArray(int[] arr) {
        int len = arr.length;
        int[] temp = new int[len];

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                int temp_1 = 0;
                if (arr[i] < arr[j]) {
                    temp_1 = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp_1;
                }
            }
        }

        return temp;
    }

    static void sortInMaxAndMinWay(int[] arr) {
        int lastIdx = arr.length - 1;
        int firstIdx = 0;
        int[] temp = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) { // Checking the odd indices
                temp[i] = arr[lastIdx];// Assigning lowest elements
                lastIdx--;
            } else {
                temp[i] = arr[firstIdx];
                firstIdx++;
            }
        }

        System.out.println(Arrays.toString(temp));
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 7, 9, 10, 0 };
        // Output => {10,0,9,1,7,2,4,3}
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
        sortInMaxAndMinWay(arr);

    }
}
