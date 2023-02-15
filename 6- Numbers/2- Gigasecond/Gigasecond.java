import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Gigasecond {
    long gigasec = 1000000000;
    private LocalDateTime moment;

    public Gigasecond(LocalDate moment) {
        this(moment.atTime(0, 0, 0));
    }

    public Gigasecond(LocalDateTime moment) {
        this.moment = moment.plusSeconds(gigasec);
    }

    public LocalDateTime getDateTime() {
        return this.moment;
    }
}
