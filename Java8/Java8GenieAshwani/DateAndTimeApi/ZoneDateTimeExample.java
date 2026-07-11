import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeExample {
    public static void main(String[] args) {
        ZonedDateTime india = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        ZonedDateTime london = ZonedDateTime.now(ZoneId.of("Europe/London"));

        System.out.println(india);

        System.out.println(london);
    }
}
