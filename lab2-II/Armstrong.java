// Program to check if three digits are an Armstrong number.
class Armstrong {
    public static void main(String[] args) {
        int num, temp, rem, sum = 0;
        num = 123;
        temp = num;
        while (temp != 0) {
            rem = temp % 10;
            sum = sum + (rem * rem * rem);
            temp = temp / 10;
        } // Loop Ends Here
        if (sum == num)
            System.out.println("Armstrong number.");
        else
            System.out.println("Not an Armstrong number.");
    }
}