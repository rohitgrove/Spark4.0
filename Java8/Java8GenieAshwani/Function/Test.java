import java.util.function.Function;

// Write a function for return String length
public class Test {
    public static void main(String[] args) {
        Function<String, Integer> i = s -> s.length();
        System.out.println(i.apply("Rohit"));
        System.out.println(i.apply("Grover"));
    }
}
