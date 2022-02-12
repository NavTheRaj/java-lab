
/*
Write a program that displays the amount entered by user in nepali money format.
Example: 
input: 1242342
output: 1,24,342
*/
import java.util.Scanner;

public class QN20 {
    public static void main(String[] args) {
        String finalNumber = "";
        String inputNum = "1242342";
        int count = 0;
        StringBuilder stringNum = new StringBuilder(inputNum);
        stringNum.reverse();
        for (int i = 0; i < stringNum.length(); i++) {
            char ch = stringNum.charAt(i);
            finalNumber = finalNumber + ch;
            count++;
            if (count != 1 && (count % 2) != 0) {
                if (count == stringNum.length()) {
                    break;
                }
                finalNumber = finalNumber + ",";
            }
        }
        StringBuilder result = new StringBuilder(finalNumber);
        System.out.println(result.reverse());
        // sc.close();
    }
}
