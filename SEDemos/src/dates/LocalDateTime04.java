package dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * Formatting Date/Time using custom formatter.
 * 
 * @author soufrk
 *
 */
public class LocalDateTime04 {
    
    private static String[] PATTERNS = {
        "yyyy MM dd", "uuuu MMM dd",
        "yyyy MMM d", "yyyy L dd", "hh mm aa", "hh mm a"};

    public static void main(String[] args) {
        for(String pattern:PATTERNS) {
            try {        
            System.out.println(LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern(pattern)));
            } catch(DateTimeParseException|IllegalArgumentException e) {
                System.out.format("Unable to use [pattern] [%s]!!\n", pattern);
                //e.printStackTrace();
            }
        }
    }

}
