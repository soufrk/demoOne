package dates;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * Parsing date from string using custom
 * formatter.
 * 
 * @author soufrk
 *
 */
public class LocalDateTime03 {
    
    private static String[][] DATE_AND_PATTERNS = {
	    {"yyyy MM dd", "1990 04 21"},
	    {"uuuu MMM dd", "2000 Jul 13"},
	    {"uuuu MMM dd", "2000 JUL 13"},
	    {"yyyy MMM d", "2000 Jul 9"},
	    {"yyyy L dd", "2000 October 09"},
	    {"hh mm aa", "12 24 PM"},
	    {"hh mm a", "12 24 PM"}
	};

    public static void main(String[] args) {
//	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
//	String input = "1990 04 21";
//	System.out.println(formatter.parse(input));
	for(String[] inputPair:DATE_AND_PATTERNS) {
	    parseDate(inputPair[0], inputPair[1]);
	}
    }
    
    private static void parseDate(String format, String input) {
	try {
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
	    System.out.println(formatter.parse(input));
	} catch(DateTimeParseException|IllegalArgumentException e) {
	    System.out.format("Unable to parse [value|format] [%s|%s]!!\n", input, format);
	    //e.printStackTrace();
	}
    }

}
