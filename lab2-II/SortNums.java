// Program to sort three numbers in java
class SortNums {
    public static void main(String[] args) {
        int num1, num2, num3;
        num1 = 1;
        num2 = 8;
        num3 = 4;

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 > num3) {
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }
        System.out.println("Sorted numbers are " + num1 + " " + num2 + " " + num3);
    }
}