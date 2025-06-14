public class Q4 {
    public static void main(String[] args) {
        try {
            try {
                int a = 10 / 0;
            } catch (NullPointerException e) {
                System.out.println("Inner Catch");
            }
            catch (ArithmeticException e) {
                System.out.println("inner catch-Arith");
            }
        } catch (Exception e) {
            System.out.println("Outer Exception");
        }
        System.out.println("done");
    }
}
