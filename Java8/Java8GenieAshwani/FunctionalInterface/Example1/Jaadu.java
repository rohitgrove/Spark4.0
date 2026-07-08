public class Jaadu {
    public static void main(String[] args) {
        // Without Lambda expression
        // A a = new A();
        // a.m1();

        Inter i = () -> System.out.println("Hello-M1 Good night");
        i.m1();
    }
}