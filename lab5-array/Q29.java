import java.util.Arrays;

public class Q29 {

    static int[] seggregateArray(int[] arr) {
        int len = arr.length;
        int[] temp = new int[len];
        int firstIdx = 0; // Placement 0
        int lastIdx = len - 1; // Placement of 1
        for (int i : arr) { // for (int i=0;i<arr.length;i++) { arr[i]}
            if (i == 0) {
                temp[firstIdx] = i;
                firstIdx++;
            } else {
                temp[lastIdx] = i;
                lastIdx--;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 1, 0, 0, 0, 1 };
        int[] result = seggregateArray(arr);
        System.out.println(Arrays.toString(result));
    }
}
