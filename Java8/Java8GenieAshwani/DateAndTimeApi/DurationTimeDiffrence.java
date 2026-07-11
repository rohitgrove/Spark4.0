import java.time.Duration;
import java.time.LocalTime;

public class DurationTimeDiffrence {
    public static void main(String[] args) {

        LocalTime t1 = LocalTime.of(10, 30);

        LocalTime t2 = LocalTime.of(13, 15);

        Duration duration = Duration.between(t1, t2);

        System.out.println(duration.toHours());

        System.out.println(duration.toMinutes());
    }
}
