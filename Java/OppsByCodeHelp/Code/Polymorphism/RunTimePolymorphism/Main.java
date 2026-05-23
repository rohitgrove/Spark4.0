public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rect r = new Rect();
        // Runtime Polymorphism
        // c.draw();
        // r.draw();

        // dynamic Method dispatch
        // upcasting
        doDrawStuff(c);
        doDrawStuff(r);
        // Shape s = new Shape();
        // doDrawStuff(s);
        
        // Downcasting
        // doDrawStuffDownCasting(c);
        doDrawStuffDownCasting(r);
    }

    // upcasting method
    public static void doDrawStuff(Shape s) {
        s.draw();
    }

    // downcasting method
    public static void doDrawStuffDownCasting(Shape s) {
        s.draw();
        Circle c = (Circle)s;
        c.personal();
    }
}
