public class CountDigits {

    public static void main(String[] args) {

        int count = 0, num = 125463;
        int temp = num;

        while (temp != 0) {
            temp = temp / 10;
            ++count;
        }

        System.out.println("Number of digits in " + num + " is: " + count);
    }

}
