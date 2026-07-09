import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        // Predicate<Integer> P = I -> I > 50;
        // Predicate<String> P1 = s -> s.length() > 5;
        // System.out.println(P.test((10)));
        // System.out.println(P1.test("RohitGrover"));

        int x[] = { 1, 2, 3, 4, 5, 6 };
        Predicate<Integer> p1 = I -> I % 2 == 0;
        Predicate<Integer> p2 = I -> I > 2;
        System.out.println("print all even numbers:");
        m1(p1, x);
        System.out.println("print all numbers gretar than 2:");
        m1(p2, x);
        System.out.println("print all numbers gretar than 2 and even:");
        m1(p2.and(p1), x);
        System.out.println("print all odd numbers:");
        m1(p1.negate(), x);
        System.out.println("print all numbers gretar than 2 or even:");
        m1(p2.or(p1), x);
    }

    public static void m1(Predicate<Integer> p, int x[]) {
        for (int i : x) {
            if (p.test(i)) {
                System.out.println(i);
            }
        }
    }
}
