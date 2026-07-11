import java.util.Arrays;
import java.util.List;

public class ReferenceToInstanceMethodOfAnArbitraryObject {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rohit", "aman", "Karan");

        // Lambda
        // names.sort((a, b) -> a.compareToIgnoreCase(b));
        // Method Refernce
        names.sort(String::compareToIgnoreCase);
        System.out.println(names);
    }
}