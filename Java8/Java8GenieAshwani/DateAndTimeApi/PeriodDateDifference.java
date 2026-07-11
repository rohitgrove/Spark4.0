import java.time.LocalDate;
import java.time.Period;

public class PeriodDateDifference {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2024, 1, 10);

        LocalDate end = LocalDate.of(2026, 7, 11);

        Period period = Period.between(start, end);

        System.out.println(period.getYears());

        System.out.println(period.getMonths());

        System.out.println(period.getDays());
    }
}
