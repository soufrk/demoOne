package formatter.simpledatefromat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * To disply the day of week
 * 
 * @author soufrk
 *
 */
public class DayOfWeek {

    public static void main(String[] args) {
	String pattern1 = "E";
	String pattern2 = "EEEE";
	SimpleDateFormat sdf1 = new SimpleDateFormat(pattern1, Locale.US);
	SimpleDateFormat sdf2 = new SimpleDateFormat(pattern2, Locale.US);
	Date d = new Date();
	System.out.println(sdf1.format(d));
	System.out.println(sdf2.format(d));
    }

}
