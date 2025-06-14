import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsTest1 {
    public static void main(String[] args) {
        try {
            m1();
            System.out.println("main");
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }
    }

    public static void m1() throws FileNotFoundException {
        m2("genie.txt");
        System.out.println("m1");
    }

    public static void m2(String fileName) throws FileNotFoundException {
        FileReader fileReader = new FileReader(fileName);
    }
}