import java.io.FileReader;

class CountChars {
    public static void main(String[] args) {
        int count = 0;
        /// propgram to count the characters in a file
        try {
            FileReader fr = new FileReader("dummy.txt");
            int i;
            while ((i = fr.read()) != -1) {
                System.out.println((char) i);
                if ((char) i != ' ')
                    count++;

            }
            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(count);
    }
}