public class Sparrow implements Bird, Walk {
    @Override
    public void fly() {
        System.out.println("Sparrow flying 2");
        System.out.println("Sparrow flying 23e23233");
        System.out.println("Sparrow 3423 32");
        System.out.println("Sparrow 434 2");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow eating");
    }

    @Override
    public void walking() {
        int a = Walk.legs;
        System.out.println("Sparrow walking");
    }
}
