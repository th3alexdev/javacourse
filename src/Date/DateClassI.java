package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClassI {
    public static void main(String[] args) {

        Date date = new Date();

        System.out.println("Date Object -> " + date);

        SimpleDateFormat df = new SimpleDateFormat("EEE, MMM d, ''yy");
        String dfToStr = df.format(date);

        System.out.println("Formatted Date -> " + dfToStr);
    }
}
