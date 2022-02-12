import java.text.DecimalFormat;

public class RoundingOff {
    public static void main(String[] args) {
        double num = 20000000;
        DecimalFormat df = new DecimalFormat("##,##,###");
        System.out.println("Rounded off value is: " + df.format(num));
    }
}
