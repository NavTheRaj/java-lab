import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        System.out.println(isLeapYear(year));
        sc.close();
    }

    static boolean isLeapYear(int year) {
        boolean result = true;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return result;
                } else {
                    return !result;
                }
            } else {
                return result;
            }
        } else {
            return !result;
        }
    }
}