class Q14 {

    public static void getAreaOfTriangle(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("The area of the triangle is " + area);
    }

    public static void main(String[] args) {
        // Calculate the area of a triangle
        double side1 = 10;
        double side2 = 20;
        double side3 = 20;

        getAreaOfTriangle(side1, side2, side3);

    }
}