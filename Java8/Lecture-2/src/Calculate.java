@FunctionalInterface
public interface Calculate {
    // 1: Only one
    public void printName();
    // N : default methods
    default void methodOne() {
        System.out.println("This is default method one");
    }
    default void methodTwo() {
        System.out.println("This is default method Two");
    }
    static void methodStaticOne() {
        System.out.println("this is static method one");
    }
    static void methodStaticTwo() {
        System.out.println("this is static method two");
    }
}
