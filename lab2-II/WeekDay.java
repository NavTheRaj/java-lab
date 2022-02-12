import java.util.Scanner;

// Program that input a number from the user and checks if the number is between
// 1-7 or not. If the number is not between 1-7, your program should make the number fall in
// the range, then displays the name of the weekday

class WeekDay {
    public static void main(String[] args) {
        int day;
        String dayName;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 7: ");
        day = scan.nextInt();

        if (day < 1 || day > 7) {
            day = (day % 7);
        }

        switch (day) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }
        System.out.println("The day is " + dayName);
    }

}
