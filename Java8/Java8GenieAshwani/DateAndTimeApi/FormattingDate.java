import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingDate {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("MM/dd/yyyy");

        String formatted = today.format(formatter);

        System.out.println(formatted);
    }
}
