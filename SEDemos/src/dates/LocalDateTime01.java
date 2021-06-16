package dates;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Basic utilities of LocalDate and LocalTime
 * 
 * @author soufrk
 *
 */
public class LocalDateTime01 {

    public static void main(String[] args) {
        // Get System Date
        System.out.println(LocalDate.now());
        // Get System Time
        System.out.println(LocalTime.now());
    }

}
