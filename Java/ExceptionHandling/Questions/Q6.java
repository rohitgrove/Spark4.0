public class Q6 {
    public static void main(String[] args) {
        System.out.println("hello" + m1());
    }

    public static int m1() {
        try {
            return 10;
        } finally {
            System.out.println("finally");
        }
    }
}
