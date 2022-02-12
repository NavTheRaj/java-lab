class QN18 {
    public static void main(String args[]) {
        String password = "asdfASDF1234!@#$";
        int upper = 0, lower = 0, number = 0, special = 0;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            System.out.println(ch);
            if (ch >= 'A' && ch <= 'Z') {
                upper++;
            } else if (ch >= 'a' && ch <= 'z') {
                lower++;
            } else if (ch >= '0' && ch <= '9') {
                number++;
            } else {
                special++;
            }
        }

        System.out.println("Lower case letters : " + lower);
        System.out.println("Upper case letters : " + upper);
        System.out.println("Number : " + number);
        System.out.println("Special characters : " + special);
    }
}