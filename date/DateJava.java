import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class DateJava {

    public static void main(String[] args) {
        
        LocalDateTime d = null;
        LocalDateTime d1 = null;
        LocalDateTime d2 = null;
        LocalDate date = null;
        LocalTime time = null;
        DateTimeFormatter f = null;
        String s = null;

        // 現在時刻で生成
        d = LocalDateTime.now();
        System.out.println(d);

        // 任意の日時で生成
        d = LocalDateTime.of(2020, 10, 21, 9, 1, 2);
        System.out.println(d);

        // 別々の日付と時刻で生成
        date = LocalDate.of(2020, 10, 21);
        time = LocalTime.of(9, 1, 2);
        d = LocalDateTime.of(date, time);
        System.out.println(d);

        // 値の取得
        d = LocalDateTime.of(2020, 10, 21, 9, 1, 2, 3);
        System.out.println(d.getYear());
        System.out.println(d.getMonthValue());
        System.out.println(d.getDayOfMonth());
        System.out.println(d.getHour());
        System.out.println(d.getMinute());
        System.out.println(d.getSecond());
        System.out.println(d.getNano());

        // 曜日の取得
        d = LocalDateTime.of(2020, 10, 21, 9, 1, 2, 3);
        System.out.println(d.getDayOfWeek());
        System.out.println(d.getDayOfWeek().getValue());
        System.out.println(d.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.JAPANESE));

        // LocalDateTimeからLocalDateの取得
        d = LocalDateTime.of(2020, 10, 21, 9, 1, 2, 3);
        date = d.toLocalDate();
        System.out.println(date);

        // LocalDateTimeからLocalTimeの取得
        d = LocalDateTime.of(2020, 10, 21, 9, 1, 2, 3);
        time = d.toLocalTime();
        System.out.println(time);

        // 日時の加算
        d = LocalDateTime.of(2020, 1, 1, 0, 0, 0);
        System.out.println(d.plusYears(1));
        System.out.println(d.plusMonths(2));
        System.out.println(d.plusDays(3));
        System.out.println(d.plusHours(4));
        System.out.println(d.plusMinutes(5));
        System.out.println(d.plusSeconds(6));
        System.out.println(d.plusNanos(7));
        System.out.println(d.plusWeeks(8));

        // 日時の減算
        d = LocalDateTime.of(2020, 1, 1, 0, 0, 0);
        System.out.println(d.minusYears(1));
        System.out.println(d.minusMonths(2));
        System.out.println(d.minusDays(3));
        System.out.println(d.minusHours(4));
        System.out.println(d.minusMinutes(5));
        System.out.println(d.minusSeconds(6));
        System.out.println(d.minusNanos(7));
        System.out.println(d.minusWeeks(8));

        // ChronoUnitを使った時間差
        d1 = LocalDateTime.of(2020, 1, 1, 0, 0, 0);
        d2 = LocalDateTime.of(2020, 10, 21, 9, 1, 2, 3);
        System.out.println(ChronoUnit.YEARS.between(d1, d2));
        System.out.println(ChronoUnit.MONTHS.between(d1, d2));
        System.out.println(ChronoUnit.DAYS.between(d1, d2));
        System.out.println(ChronoUnit.HOURS.between(d1, d2));
        System.out.println(ChronoUnit.MINUTES.between(d1, d2));
        System.out.println(ChronoUnit.SECONDS.between(d1, d2));

        // Perios/Durationを使った時間差
        d1 = LocalDateTime.of(2020, 1, 1, 0, 0, 0);
        d2 = LocalDateTime.of(2020, 10, 21, 9, 1, 2, 3);
        Period p = Period.between(d1.toLocalDate(), d2.toLocalDate());
        System.out.println(p);
        System.out.println(p.getYears());
        System.out.println(p.getMonths());
        System.out.println(p.getDays());
        Duration duration = Duration.between(d1, d2);
        System.out.println(duration);
        System.out.println(duration.toDays());
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
        System.out.println(duration.getSeconds());

        // 日時の比較
        d1 = LocalDateTime.of(2020, 1, 1, 0, 0, 0);
        d2 = LocalDateTime.of(2020, 10, 21, 9, 1, 2, 3);
        System.out.println(d1.isBefore(d2));
        System.out.println(d1.isEqual(d2));
        System.out.println(d1.isAfter(d2));

        // 日時をフォーマット
        d = LocalDateTime.of(2020, 10, 21, 9, 1, 2, 3);
        f = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(d.format(f));

        // 文字列から日時に変換
        s = "2020-10-21T09:01:02";
        d = LocalDateTime.parse(s);
        System.out.println(d);

        s = "2020/10/21 09:01:02";
        f = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        d = LocalDateTime.parse(s, f);
        System.out.println(d);

    }
}