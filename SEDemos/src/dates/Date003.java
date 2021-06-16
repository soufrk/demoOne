package dates;

import java.util.Calendar;

public class Date003 {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.add(Calendar.MINUTE, 10);
        System.out.println(calendar.getTime());
    }

}
