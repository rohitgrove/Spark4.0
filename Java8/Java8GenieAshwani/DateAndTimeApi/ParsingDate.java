import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParsingDate {
    public static void main(String[] args) {

        String date = "25/12/2026";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate d = LocalDate.parse(date, formatter);

        System.out.println(d);
    }
}
