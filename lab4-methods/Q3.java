public class Q3 {

    public static void main(String[] args) {
        int a = 50;
        int b = 20;
        int c = 30;

        getSmallestNumber(a, b, c);
    }

    public static void getSmallestNumber(int num1, int num2, int num3) {
        int smallest = num1;
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }
        System.out.println("The smallest value is " + smallest);
    }

}
