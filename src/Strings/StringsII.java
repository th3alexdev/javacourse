package Strings;
public class StringsII {
    public static void main(String[] args) {
        String course = null;
        
        boolean isNull = (course == null);
        System.out.println("isNull? -> " + isNull);

        if (!isNull) {
            System.out.println(course.toUpperCase());
        }
    }
}
