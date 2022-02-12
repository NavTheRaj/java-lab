import java.util.Scanner;

// Write a program in Java to input 5 numbers from keyboard and find their sum
// and average.

class ArraySum {
    public static void main(String[] args) {
        int[] num = new int[5];
        int sum = 0;
        int avg = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            num[i] = sc.nextInt();
            sum += num[i];
        }
        avg = sum / num.length;
        System.out.println("Sum of the numbers is " + sum);
        System.out.println("Average of the numbers is " + avg);
    }
}