import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();

        System.out.println(time);

        System.out.println(time.getHour());

        System.out.println(time.getMinute());

        System.out.println(time.getSecond());
    }
}