package Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class CalendarClass {
    public static void main(String[] args) {
        Calendar calendarOne = Calendar.getInstance();
        Calendar calendarTwo = Calendar.getInstance();

        /* There are two ways to set calendars */

        // # 1
        calendarOne.set(2002, Calendar.SEPTEMBER, 30, 8, 30, 25);

        // # 2
        calendarTwo.set(Calendar.YEAR, 2002);
        calendarTwo.set(Calendar.MONTH, Calendar.SEPTEMBER);
        calendarTwo.set(Calendar.DAY_OF_MONTH, 30);
        // calendarTwo.set(Calendar.HOUR_OF_DAY, 8);
        calendarTwo.set(Calendar.HOUR_OF_DAY, 8);
        calendarTwo.set(Calendar.AM_PM, Calendar.AM);
        calendarTwo.set(Calendar.MINUTE, 30);
        calendarTwo.set(Calendar.SECOND, 25);
        calendarTwo.set(Calendar.MILLISECOND, 125);

        Date dateOne = calendarOne.getTime();
        Date dateTwo = calendarTwo.getTime();

        System.out.println("Calendar #1 -> " + dateOne);
        System.out.println("Calendar #2 -> " + dateTwo);

        // Now with format
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS a");
        String dateWithFormat = df.format(dateOne);
        System.out.println(dateWithFormat);
    }
}
