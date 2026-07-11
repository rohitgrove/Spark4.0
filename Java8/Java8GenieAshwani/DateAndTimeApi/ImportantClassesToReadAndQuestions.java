import java.time.LocalDate;
import java.time.Month;

public class ImportantClassesToReadAndQuestions {
/* | Class               | Use                     |
| ------------------- | ----------------------- |
| `LocalDate`         | Sirf Date               |
| `LocalTime`         | Sirf Time               |
| `LocalDateTime`     | Date + Time             |
| `ZonedDateTime`     | Date + Time + Time Zone |
| `Period`            | Do Dates ka difference  |
| `Duration`          | Do Times ka difference  |
| `DateTimeFormatter` | Formatting aur Parsing  |
*/

    // Interview answer
    /*
     * Java 8 me java.time package introduce kiya gaya kyunki purani Date, Calendar,
     * aur SimpleDateFormat classes mutable,
     * thread-safe nahi thi, aur unka design confusing tha (jaise months 0-based
     * hona). Java 8 ne immutable,
     * thread-safe aur clean API di, jisme LocalDate, LocalTime, LocalDateTime,
     * ZonedDateTime, DateTimeFormatter, Period,
     * aur Duration jaise classes introduce ki gayi.
     */

    // Interview Question

    // Q: Why are months in Calendar 0-based but in LocalDate 1-based?

    // Answer:
    // Calendar ka design purana aur confusing tha. Java 8 ke java.time API me
    // months ko human-readable banaya gaya, isliye LocalDate.of(year, month, day)
    // me January = 1 aur December = 12 rakha gaya.
    // Ek aur interview tip: Java 8 me tum numbers ki jagah Month enum bhi use kar
    // sakte ho:
    LocalDate date = LocalDate.of(2026, Month.JULY, 11);
    // Ye aur bhi readable hai aur galat month number dene ki possibility kam ho
    // jati hai.
}
