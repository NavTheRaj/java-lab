import java.util.Arrays;

class CommandLine {

    public static void main(String[] args) {
        int sum = 0;
        for (String arg : args) {
            sum = sum + Integer.valueOf(arg);
        }
        System.out.println(sum);
    }
}