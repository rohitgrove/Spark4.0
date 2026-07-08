interface I {
    default void m1() {
        System.out.println("Hello m1-I");
    }
}

interface J {
    default void m1() {
        System.out.println("Hello m1-J");
    }
}

public class DefaultMethod implements I, J {
    public static void main(String[] args) {
        DefaultMethod d = new DefaultMethod();
        d.m1();
    }

    @Override
    public void m1() {
        System.out.println("Hello m1 - d");
    }
}
