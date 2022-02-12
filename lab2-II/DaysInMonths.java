import java.util.Scanner;

public class DaysInMonths {

    static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int month, year;
        int days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        System.out.println("Enter the month and year");
        Scanner in = new Scanner(System.in);
        month = in.nextInt();
        year = in.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Invalid month");
            return;
        }
        if (year < 1 || year > 9999) {
            System.out.println("Invalid year");
            return;
        }
        if (month == 2 && isLeapYear(year)) {
            System.out.println("Number of days in February " + year + " is 29");
        } else {
            System.out.println("Number of days in " + month + " " + year + " is " + days[month - 1]);
        }

    }
}
