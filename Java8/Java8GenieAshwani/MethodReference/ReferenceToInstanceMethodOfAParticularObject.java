import java.util.function.Consumer;

class Printer {
    public void print(String msg) {
        System.out.println(msg);
    }
}

public class ReferenceToInstanceMethodOfAParticularObject {
    public static void main(String[] args) {

        Printer printer = new Printer();

        // Lambda
        Consumer<String> c1 = s -> printer.print(s);

        c1.accept("Hello");

        // Method Reference
        Consumer<String> c2 = printer::print;

        c2.accept("Welcome");
    }
}