package WrapperClass;
public class WrapperClassI {
    public static void main(String[] args) {

        Integer numInt = new Integer(1245); // ! Totally Deprecated

        Integer num = Integer.valueOf(12345); //
        Long longNum = Long.valueOf(12939149104L); //

        String strNum = num.toString(); // to String
        int i = num.intValue(); // to Integer

        byte b = num.byteValue(); // to Byte
        short s = num.shortValue(); // to Short
        float f = num.floatValue(); // to Float
        long l = num.longValue(); // to Long

        double d = num.doubleValue(); // to Double
        int z = Integer.parseInt("12345"); // String to Integer

        // ---

        String str = "2002"; // String
        Integer strToInt = Integer.valueOf(str); // Cast string to integer
        Short strToShort = Short.valueOf(str); // Cast string to Short
        Float strToFloat = Float.valueOf(str); // Cast string to Float
        Byte strToByte = Byte.valueOf(str); // Cast string to Byte
    }
}
