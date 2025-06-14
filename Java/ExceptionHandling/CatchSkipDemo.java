public class CatchSkipDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Try block");
        } catch (Exception e) {
            System.out.println("catch block");
        }
        System.out.println("done");
    }
}
