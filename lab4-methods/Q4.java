public class Q4 {

    public static float getAverage(int num1, int num2, int num3) {
        float average = (num1 + num2 + num3) / 3;
        System.out.println("The average is " + average);
        return average;
    }

    public static void main(String[] args) {
        int a = 50;
        int b = 20;
        int c = 30;

        float result = getAverage(a, b, c);

        System.out.println(result);
    }
}
