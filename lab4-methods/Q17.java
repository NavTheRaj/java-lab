import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number and an arthimetic operator:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        char ch = sc.next().charAt(0);
        System.out.println("-------------------------");
        System.out.println(operateAsPerArgument(num1, num2, ch));
        sc.close();
    }

    public static int operateAsPerArgument(int num1, int num2, char ch) {
        int total = 0;
        switch (ch) {
            case '+':
                total = num1 + num2;
                break;
            case '-':
                total = num1 - num2;
                break;
            case '*':
                total = num1 * num2;
                break;
            case '/':
                total = num1 / num2;
                break;
            case '%':
                total = num1 % num2;
                break;
            default:
                System.out.println("Invalid Operator.");
                break;
        }
        return total;
    }
}