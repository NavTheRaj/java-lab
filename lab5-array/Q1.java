import java.util.Scanner;

// Write a Java Program to input n integer values from user, store it into an
// array and print
// all the elements

class Q1 {

    public static void displayArrayValues(int[] items) {
        System.out.println("------------------------");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int[] items = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            items[i] = sc.nextInt();
        }
        displayArrayValues(items);
        sc.close();
    }
}