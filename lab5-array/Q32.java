import java.util.Arrays;

public class Q32 {
    static void separateEvenOddNums(int[] arr) {
        int len = arr.length;
        int evenIdx = 0;
        int oddIdx = len - 1;
        int[] temp = new int[len];

        for (int num : arr) {
            if (num % 2 == 0) {
                temp[evenIdx++] = num;
            } else {
                temp[oddIdx--] = num;
            }
        }

        System.out.println(Arrays.toString(temp));
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        separateEvenOddNums(arr);
    }
}
