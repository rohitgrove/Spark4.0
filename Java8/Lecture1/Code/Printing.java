public class Printing {
    public static void main(String[] args) {
        // Print 1 - 100
        System.out.println("Counting");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        // Print 1 - 100 Even Numbers
        System.out.println("Even Numbers");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("OddNumbers");
        // Print 1 - 100 Odd Numbers
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("Table of 5");
        // Print 1 - 100 Multiples of 5 Numbers
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
