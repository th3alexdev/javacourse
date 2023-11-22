package Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClassIII {
    public static void main(String[] args) {

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date;
        try {
            date = df.parse("0-0-0");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        System.out.println("date -> " + df.format(date));
    }
}
