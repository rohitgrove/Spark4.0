public class ExampleOfLambdaExpression {
    public static void main(String[] args) {
        // java 7
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running...");
            }
        };

        // java 8
        Runnable runnable2 = () -> System.out.println("Running...");
    }
}
