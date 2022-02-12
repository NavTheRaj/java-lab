class Q1 {

    public static void printHelloWorld() {
        System.out.println("Hello World!");
    }

    public static void printString(String s) {
        System.out.println(s);
    }

    public static String getString(String s, int number) {
        return s + " is awesome";
    }

    public static void main(String[] args) {
        printHelloWorld();
        printString("Ram");
        String returnedValue = getString("Raj", 1);
        System.out.println(returnedValue);
    }
}