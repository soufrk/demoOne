package dates;

import java.util.Calendar;

public class Date001 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getWeeksInWeekYear());
		System.out.println(calendar.getFirstDayOfWeek());
		System.out.println(calendar.getTimeZone());
	}

}
