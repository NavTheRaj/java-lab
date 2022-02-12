
/*
Write a program that converts the number entered in English to nepali.
input: 122.332
output: १२२.३३२
*/
import java.util.Scanner;

public class QN29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number in English:");
        String inputNum = sc.next();
        String nepaliFormat = "";
        for (int i = 0; i < inputNum.length(); i++) {
            if (inputNum.charAt(i) == '.') {
                nepaliFormat += ".";
            } else {
                nepaliFormat += (char) (inputNum.charAt(i) + 2358);
            }
        }
        System.out.println("Numbers in Nepali:  " + nepaliFormat);
        sc.close();
    }
}
