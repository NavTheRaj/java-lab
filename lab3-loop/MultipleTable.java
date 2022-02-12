// Write a program in Java to display the multiplication table of a given integer up to 10.

public class MultipleTable {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}
