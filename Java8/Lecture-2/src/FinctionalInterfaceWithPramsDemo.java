import java.util.Arrays;

public class FinctionalInterfaceWithPramsDemo {
    public static void main() {
        CalcOperation addition = (int a, int b) -> {
            System.out.println("Values are : " + a + " , " + b);
            return (double) (a + b);
        };

        double add = addition.operation(20, 50);
        System.out.println(add);

        CalcOperation abstraction = (int a, int b) -> {
            System.out.println("Values are : " + a + " , " + b);
            return (double) (a - b);
        };

        System.out.println(abstraction.operation(400, 500));
    }
}
