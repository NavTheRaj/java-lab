public class MaxNum {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int max = 0;
        int min = 0;
        // Syntax ---> result = (condition) ? var1 : var2;
        max = (num1 > num2) ? num1 : num2;
        min = (num1 < num2) ? num1 : num2;

        System.out.println("Maximum number between "
                + num1 + " and " + num2 + " is " + max);

        System.out.println("Minimum number between "
                + num1 + " and " + num2 + " is " + min);
    }

}
