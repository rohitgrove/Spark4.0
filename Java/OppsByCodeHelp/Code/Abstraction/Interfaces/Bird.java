public interface Bird {
    void fly();

    void eat();

    default void sleep() {
        System.out.println("Bird sleep");
    }
}