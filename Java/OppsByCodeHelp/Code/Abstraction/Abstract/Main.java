public class Main {
    public static void main(String[] args) {
        // Bird b = new Sparrow();
        // b.fly();
        // b.eat();

        // b = new Crow();
        // b.fly();
        // b.eat();
        doBirdStuff(new Sparrow());
        doBirdStuff(new Crow());
    }

    public static void doBirdStuff(Bird b) {
        b.eat();
        b.fly();
        b.eat();
        b.fly();
        b.eat();
        b.fly();
        b.eat();
        b.fly();
        b.eat();
        b.fly();
        b.eat();
        b.fly();
        b.eat();
        b.fly();
        b.eat();
        b.fly();
    }
}
