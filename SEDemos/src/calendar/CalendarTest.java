package calendar;

import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;

public class CalendarTest {

	public static void main(String[] args) {
		Formatter formatter = new Formatter();
		Calendar calendar = Calendar.getInstance(Locale.US);
		calendar.set(2012, Calendar.FEBRUARY, 1);
		formatter.format("%tY/%tm/%td", calendar, calendar, calendar, calendar);
		System.out.println(formatter);

	}

}
