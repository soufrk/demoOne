package dates;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * Add/Reduce date time
 * 
 * @author soufrk
 *
 */
public class LocalDateTime05 {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now(); 
        System.out.println(today
            .plus(Period.ofDays(90))
            .format(
                DateTimeFormatter.ofPattern("dd-MMMM-uuuu"))
                );
    }

}
