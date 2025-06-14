public class ExceptionInDepth {
    public static void main(String[] args) {
        System.out.println("Hello Jee Main");
    }

    public static void m1() {
        m2();
        System.out.println("Hello Jee m1");
    }

    public static void m2() {
        m3();
        System.out.println("Hello Jee m2");
    }

    public static void m3() {
        System.out.println(10 / 0);
        System.out.println("Hello Jee m3");
    }
}
