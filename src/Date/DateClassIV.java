package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClassIV {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        Date dateOne = new Date();
        Date dateTwo = df.parse("2002-09-30");

        System.out.println("dateOne -> " + dateOne);
        System.out.println("dateTwo -> " + dateTwo);

        if(dateOne.after(dateTwo)) {
            System.out.println("It's after");
        } else if (dateOne.before(dateTwo)) {
            System.out.println("It's before");
        } else {
            System.out.println("They're the same");
        }
    }
}
