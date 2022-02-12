public class Q11 {
    public static void main(String[] args) {
        int[] items = { 1, 3, 3, 4, 1, 6 };
        int len = items.length;
        for (int i = 0; i < len; i++) { // i =2 items[1] = 3 is checked
            for (int j = i + 1; j < len; j++) { // with {3,4,1,6}
                if (items[i] == items[j]) {
                    System.out.println(items[i]);
                }
            }
        }

    }
}
