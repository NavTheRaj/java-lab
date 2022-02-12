
public class EnToNep {

    public static String ConvertNumerals(String input) {

        return input.replace('0', '०')
                .replace('1', '१')
                .replace('2', '२')
                .replace('3', '३')
                .replace('4', '४')
                .replace('5', '५')
                .replace('6', '६')
                .replace('7', '७')
                .replace('8', '८')
                .replace('9', '९');
    }

    public static void main(String[] args) {
        System.out.println(ConvertNumerals("1234.2345"));
    }

}
