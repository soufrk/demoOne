package dates;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Using LocalDate and Time to parse date and time from
 * default formats.
 * 
 * @author soufrk
 *
 */
public class LocalDateTime02 {


    public static void main(String[] args) {
	String inputDate = "1990-04-21";
	System.out.println(LocalDate.parse(inputDate));
	String inputTime = "19:05:06";
	System.out.println(LocalTime.parse(inputTime));
    }

}
