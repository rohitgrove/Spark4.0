import java.time.LocalDate;

public class DateManipulation {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        System.out.println(today);

        System.out.println(today.plusDays(10));

        System.out.println(today.minusMonths(2));

        System.out.println(today.plusYears(1));
    }
}
