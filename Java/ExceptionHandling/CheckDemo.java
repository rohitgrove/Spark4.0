import java.io.FileReader;
import java.io.IOException;

public class CheckDemo {
    public static void main(String[] args) throws IOException {
        FileReader file;
        try {
            file = new FileReader("genie.txt");
            System.out.println("file found");
        } catch (IOException e) {
            System.out.println(e);
            // System.exit(0);
        } finally {
            // file.close();
            System.out.println("finally");
        }
    }
}