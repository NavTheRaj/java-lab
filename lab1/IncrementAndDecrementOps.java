import java.util.Arrays;

class IncrementAndDecrementOps {

    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;

        int result1 = (num1++) + (num2--) * num3;
        System.out.println(result1);
        int result2 = (++num1) + (--num2) * num3;
        System.out.println(result2);

    }
}