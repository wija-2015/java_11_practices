package practice_3;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * @author Wijdane KHATTAT
 */
public class DateTime3 {

    public static void main(String[] args) {
        //3.3
        //1.Explore Local date and time objects
        LocalDate today = LocalDate.now();
        System.out.println(today.plusYears(1).getDayOfWeek());

        LocalTime teaTime = LocalTime.of(20,30);
        Duration duration = Duration.between(LocalTime.now(), teaTime);
        System.out.println(duration);
        System.out.println(duration.toDays());
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
        System.out.println(duration.toMinutesPart());
        System.out.println(duration.toSeconds());
        System.out.println(duration.toSecondsPart());

        LocalDateTime tomorrowTeaTime = LocalDateTime.of(today.plusDays(1), teaTime);
        System.out.println(tomorrowTeaTime);

       //2.Apply timeZones to local date and date
        System.out.println("\n***********************************");
        ZoneId london = ZoneId.of("Europe/London");
        ZoneId katmandu = ZoneId.of("Asia/Katmandu"); //ZoneId.of("XX") throws ZoneResulException
        System.out.println(london);
        System.out.println(katmandu);
        ZonedDateTime londonTime = ZonedDateTime.of(tomorrowTeaTime, london);
        ZonedDateTime katmandoTime = londonTime.withZoneSameInstant(katmandu);
        System.out.println(londonTime);
        System.out.println(katmandoTime);
        System.out.println(katmandoTime.getOffset());

         /*
        //3. Format date and time values
        System.out.println("\n***********************************");
        Locale locale = Locale.UK;
        String datePattern = "EE', 'd' of 'MMMM yyyy' at 'HH:mm z";
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern(datePattern, locale);
        System.out.println(dateFormat);
        String timeTxt = dateFormat.format(katmandoTime);
        System.out.println(timeTxt);

        System.out.println("\n********************");
        Instant instant = Instant.now();
        System.out.println(instant);*/
    }
}
