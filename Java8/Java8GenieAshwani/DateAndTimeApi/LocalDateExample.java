import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        System.out.println(today);

        System.out.println(today.getDayOfMonth());

        System.out.println(today.getMonth());

        System.out.println(today.getYear());

        System.out.println(today.getDayOfWeek());
    }
}