import java.util.Scanner;

class InchToFeet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height in inches; ");
        int inches = sc.nextInt();

        int feet = inches / 12;

        int reminch = inches % 12;

        System.out.println(feet + " feet " + reminch + " inches");
    }

}
