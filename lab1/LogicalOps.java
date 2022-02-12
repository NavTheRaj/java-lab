class LogicalOps {
    public static void main(String[] args) {
        int a = 25;
        int b = 20;
        int c = 15;
        int d = 30;

        boolean flag1 = true;
        boolean flag2 = false;

        System.out.println(a + b == c + d);
        System.out.println(a + b != c + d);
        System.out.println(a - b > d - c);
        System.out.println(a - b < d - c);
        System.out.println(flag1 && flag2);

    }
}