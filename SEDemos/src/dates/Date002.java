package dates;

import java.util.Calendar;
/**
 * Anatomy of a Calendar instance.
 * @author soufrk
 *
 */
public class Date002 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		/* TYPICAL OUTPUT 
		 * java.util.GregorianCalendar[
				time=1440137078317, areFieldsSet=true, areAllFieldsSet=true, lenient=true,
				zone=sun.util.calendar.ZoneInfo[
					id="Asia/Calcutta",	offset=19800000, dstSavings=0, useDaylight=false,
					transitions=6, lastRule=null
				],
				firstDayOfWeek=1, minimalDaysInFirstWeek=1,	ERA=1, YEAR=2015, MONTH=7,
				WEEK_OF_YEAR=34, WEEK_OF_MONTH=4, DAY_OF_MONTH=21, DAY_OF_YEAR=233,
				DAY_OF_WEEK=6, DAY_OF_WEEK_IN_MONTH=3, AM_PM=0,HOUR=11,	HOUR_OF_DAY=11,
				MINUTE=34, SECOND=38, MILLISECOND=317, ZONE_OFFSET=19800000, DST_OFFSET=0
			]
		 */
	}

}
