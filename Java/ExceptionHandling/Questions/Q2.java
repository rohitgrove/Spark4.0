public class Q2 {
    public static void main(String[] args) {
        try {
            int x = 100 / 0;
            System.out.println("hell div");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
        System.out.println("done");
    }
}
