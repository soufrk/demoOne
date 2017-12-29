package formatter.simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Demonstration of SimpleDateFormat for parsing a date String.
 * 
 * @author soufrk
 *
 */
public class StringToDatetime {

    public static void main(String[] args) {
	SimpleDateFormat sdf = new SimpleDateFormat("M/d/Y H:m:s");
	try {
	    Date d = sdf.parse("07/11/14 10:50:23");
	} catch (ParseException e) {
	    e.printStackTrace();
	}
    }

}
