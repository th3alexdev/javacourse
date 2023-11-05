package Strings;

public class StringsMethods {
    public static void main(String[] args) {

        String str1 = "Alex";
        String str2 = new String("Alex");
        String str3 = "Francisco";

        // ! Methods
        /* length() */
        int strLength = str1.length();
        System.out.println("length -> " + strLength);

        /* .compareTo() */
        System.out.println(str1.compareTo(str3));

        /* .trim() */
        String str4 = "    Hello!  ";
        System.out.println(str4.trim());

        /* .charAt() */
        char strCharAt = str1.charAt(0);
        System.out.println(strCharAt);

        /* .toCharArray() */
        char[] strToCharArray = str1.toCharArray();
        System.out.println(strToCharArray);

        /* .substring() */
        String strToSubst1 = str1.substring(0, 3);
        String strToSubst2 = str1.substring(3);
        System.out.println(strToSubst1);
        System.out.println(strToSubst2);

        /* .indexOf() */
        int strIndex = str1.indexOf("x");
        System.out.println(strIndex);

        /* .lastIndexOf() */
        int strLastIndex = str1.lastIndexOf("o");
        System.out.println(strLastIndex);

        /* .startsWith() */
        Boolean strStartsW = str1.startsWith("u");
        System.out.println(strStartsW);

        /* .endsWith() */
        Boolean strEndsW = str1.endsWith("o");
        System.out.println(strEndsW);

        /* .split() */
        String[] strSplitted = str1.split(", ");
        System.out.println(strSplitted);

        /* .concat() */
        System.out.println("Hello ".concat(str1));

        /* .contains("t")*/
        System.out.println(str1.contains("x"));
    }
}
