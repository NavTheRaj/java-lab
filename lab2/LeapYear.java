/*
Leap year is exactly divisible by 4.
Except for century years i.e ending with 00.
For century year to be leap, it should be perfectly divisible by 400.
*/

public class LeapYear {
    public static void main(String[] args) {
        int year = 2020;

        boolean isLeap = false;

        if (year % 4 == 0) {

            // First check if the year is century then only proceed

            if (year % 100 == 0) {

                // Now for century year to be leap it must be perfectly divided by 400 so

                if (year % 400 == 0) {
                    isLeap = true;
                } else {
                    isLeap = false;
                }
            } else {

                // If the year is not century and divisible by 4
                isLeap = true;
            }

        } else {
            isLeap = false;
        }

        System.out.println("Is the given year a leap year?\n Answer => " + isLeap);
    }
}
