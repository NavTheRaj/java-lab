public class Q2 {

    public static int addTwoNumbers(int a, int b) {
        int sum = 0;
        sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = addTwoNumbers(a, b);
        System.out.println(sum);
    }
}
