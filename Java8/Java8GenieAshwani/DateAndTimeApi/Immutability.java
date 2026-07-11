import java.time.LocalDate;

public class Immutability {
    public static void main(String[] args) {
        // LocalDate date = LocalDate.now();

        // date.plusDays(5);

        // System.out.println(date);

        // Question: Date change kyun nahi hui?
        // Answer: LocalDate immutable hai. plusDays() naya object return karta hai.

        LocalDate date = LocalDate.now();
        date = date.plusDays(5);

        System.out.println(date);
    }
}
