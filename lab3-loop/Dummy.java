public class Dummy {
    public static void main(String[] args) {
        int n = 4;
        int num = 123456789;
        int j = 1;

        for (int i = 0; i < n; i++) {
            j = j * 10;
        }
        int result = num % j;
        System.out.println(result);
    }

}
