public class PrimeNum {
    public static void main(String[] args) {
        // Check if a given number is prime or not
        int num = 256;
        boolean isPrime = true;

        if (num == 1 || num == 0) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

        }
        // end of for loop
        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }

    }
}
