package formatter.utilandstring;

import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;

/**
 * Given the first few pointers, predict what becomes of the second main()
 * method.
 * 
 * @author soufrk
 *
 */
public class DateTimeFormatting {

    public static void main1(String[] args) {
	StringBuilder sb = new StringBuilder();
	// Send all output to the Appendable object sb
	Formatter formatter = new Formatter(sb, Locale.ENGLISH);
	// hh:mm:ss
	formatter.format("%tT \n", Calendar.getInstance());
	// hh:mm
	formatter.format("%tR \n", Calendar.getInstance());
	// hh:mm:ss AM/PM
	formatter.format("%tr \n", Calendar.getInstance());
	// DD/MM/YY
	formatter.format("%tD \n", Calendar.getInstance());
	// YYYY-MM-DD
	formatter.format("%tF \n", Calendar.getInstance());
	// Day Mon DD hh:mm:ss IST YYYY
	formatter.format("%tc \n", Calendar.getInstance());
	formatter.close();
	System.out.println(sb);
    }

    public static void main(String[] args) {
	StringBuilder sb = new StringBuilder();
	Formatter formatter = new Formatter(sb, Locale.ENGLISH);
	formatter.format("Local time: %1$tm %1$te,%1$tY", Calendar.getInstance());
	formatter.close();
	System.out.println(sb);
    }

}
