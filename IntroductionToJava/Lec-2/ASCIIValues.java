public class ASCIIValues {
    public static void main(String[] args) {
        System.out.println("Big Alphabets");
        for (int i = 'A'; i <= 'Z'; i++) {
            System.out.println(((char) i) + " " + i + " ");
        }

        System.out.println();

        System.out.println("Small Alphabets");
        for (int i = 'a'; i <= 'z'; i++) {
            System.out.println(((char) i) + " " +i + " ");
        }
    }
}