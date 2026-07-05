public class PrintingStatements {
    public static void main(String[] args) {
        // Even number print
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    
        System.out.println();
        // Odd number print
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    
        // Multiples of 3
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
