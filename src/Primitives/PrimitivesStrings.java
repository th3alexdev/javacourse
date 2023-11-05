package Primitives;

import java.sql.SQLOutput;

public class PrimitivesStrings {
    public static void main(String[] args) {

        String str1 = "Alex";
        String str2 = new String("Alex");
        String str3 = "Francisco";

        // Check if they are the same type
        System.out.println(str1 == str2);

        // Check if they have the same value
        System.out.println(str1.equals(str2));

        // Check if they have the same value but case-insensitive
        System.out.println(str1.equalsIgnoreCase(str2));
    }
}
