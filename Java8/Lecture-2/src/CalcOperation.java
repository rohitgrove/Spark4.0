@FunctionalInterface
public interface CalcOperation {
    double operation(int a, int b);

    default void printInfo() {
        System.out.println("This Default Data... of method");
    }

    static void typeOfOperations() {
        System.out.println("Static Content : Airthmatic Operations");
    }
}
