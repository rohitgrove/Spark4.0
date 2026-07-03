package defaultstaticinterfacementhod;

public class TestingDefaultMethods {
    public static void main() {
        ClassOne one = new ClassOne();

        // accessing default methods
        one.defaultMethodOne();
        String result = one.defaultMethodTwo();
        one.getNames();

        ClassTwo two = new ClassTwo();
        two.defaultMethodOne();
        two.defaultMethodTwo();
        two.getNames();

        ClassThree three = new ClassThree();
        three.defaultMethodThree();
    }
}
