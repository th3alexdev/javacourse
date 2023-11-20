package Date;

import java.util.Date;

public class DateClassII {
    public static void main(String[] args) {
        Date timestampStart = new Date();
        long counter = 0;

        for (int i = 0; i < 999999999; i++) {
            counter += i;
        }

        System.out.println("The amount is -> " + counter);

        Date timestampEnd = new Date();

        long duration = timestampEnd.getTime() - timestampStart.getTime();

        System.out.println("the execution time was -> " + duration);
    }
}
