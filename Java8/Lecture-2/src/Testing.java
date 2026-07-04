public class Testing {
    public static void main() {
        // Interface can refer impl. class instance
        Calculate calc = new Camel();
        calc.printName();

        // Lambda Expression
        Calculate calTwo = () -> {
            System.out.println("This is abc company");
        };
        Calculate xyz = () -> {
            System.out.println("This is xyz company");
        };

        calTwo.printName();
        xyz.printName();
    }
}
