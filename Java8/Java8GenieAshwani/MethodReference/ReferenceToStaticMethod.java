import java.util.function.Function;

public class ReferenceToStaticMethod {
    public static Integer convert(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        // Lambda
        Function<String, Integer> f1 = s -> convert(s);

        System.out.println(f1.apply("100"));

        // Method Reference
        Function<String, Integer> f2 = ReferenceToStaticMethod::convert;

        System.out.println(f2.apply("200"));
    }
}