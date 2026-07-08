public class A {
    int x = 100;
    public void show() {
        int x = 1000;
        Inter i = () -> {
            System.out.println(this.x);
            System.out.println(x);
        };
        i.m1();
    }
}