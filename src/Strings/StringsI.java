package Strings;
public class StringsI {
    public static void main(String[] args) {
        String course = "Java Full Course";
        String teacher = "Alex";

        String myCourse = course.transform(c -> {
            return c + " with Teacher " + teacher;
        });

        System.out.println("myCourse = " + myCourse);

        /* Strings are inmutable type values */
        course.replace("Java", "Python");
        System.out.println(course); // # Nothing happens

        String newCourse = course.replace("Java", "Python");
        System.out.println(newCourse); // # String was modified


    }
}
