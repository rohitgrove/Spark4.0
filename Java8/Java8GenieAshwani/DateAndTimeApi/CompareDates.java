import java.time.LocalDate;

public class CompareDates {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2026, 7, 10);

        LocalDate d2 = LocalDate.of(2026, 7, 11);

        System.out.println(d1.isBefore(d2));

        System.out.println(d1.isAfter(d2));

        System.out.println(d1.equals(d2));
    }
}
